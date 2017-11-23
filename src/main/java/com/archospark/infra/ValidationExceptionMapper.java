package com.archospark.infra;

import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.archospark.model.ServiceResponse;

@Provider
public class ValidationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

	@Override
	public Response toResponse(ConstraintViolationException exception) {
		Set<String> errors = exception.getConstraintViolations().stream().map(violation -> violation.getMessage())
				.collect(Collectors.toSet());
		return Response.ok(new ServiceResponse<>(99, errors)).type(MediaType.APPLICATION_JSON).build();
	}
}