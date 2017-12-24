package com.archospark.common.infrastructure.logging;

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
        if (logger.isDebugEnabled()) {
            logger.debug("Inside method {} in class {}", ctx.getMethod().getName(),
                    ctx.getTarget().getClass().getName());
        }
        try {
            return ctx.proceed();
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("Exiting method {} in class {}", ctx.getMethod().getName(),
                        ctx.getTarget().getClass().getName());
            }
        }
    }
}