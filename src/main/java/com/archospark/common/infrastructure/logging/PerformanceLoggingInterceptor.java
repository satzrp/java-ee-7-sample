package com.archospark.common.infrastructure.logging;

import java.time.Duration;
import java.time.Instant;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.slf4j.Logger;

@Interceptor
public class PerformanceLoggingInterceptor {

    @Inject
    private Logger logger;

    @AroundInvoke
    public Object logElapsedTime(InvocationContext ctx) throws Exception {
        Instant start = Instant.now();
        try {
            return ctx.proceed();
        } finally {
            Instant end = Instant.now();
            long elapsedTime = Duration.between(start, end).toMillis();
            logger.info("Elapsed Time of {} method in {} - {}ms ", ctx.getMethod().getName(),
                    ctx.getMethod().getDeclaringClass().getName(), elapsedTime);
        }
    }
}