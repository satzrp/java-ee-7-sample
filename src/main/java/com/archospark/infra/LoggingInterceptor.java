package com.archospark.infra;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.slf4j.Logger;

@Interceptor
public class LoggingInterceptor {

    @Inject
    private Logger logger;

    @AroundInvoke
    public Object log(InvocationContext ctx) throws Exception {
        logger.debug("Inside class {}, method {}", ctx.getTarget(), ctx.getMethod().getName());
        try {
            return ctx.proceed();
        } finally {
            logger.debug("Exiting class {}, method {}", ctx.getTarget(), ctx.getMethod().getName());
        }
    }
}