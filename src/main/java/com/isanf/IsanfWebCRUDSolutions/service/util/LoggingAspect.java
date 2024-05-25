package com.isanf.IsanfWebCRUDSolutions.service.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


//R 23
@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
    
    @Pointcut("execution(public * find*(..))")
    private void anyPublicFindOperation() {} 

    @Before("anyPublicFindOperation()")
    public void logBeforeFind(JoinPoint joinPoint) {
        logger.info("Executing public find method: {}", joinPoint.getSignature().toShortString());
        // You can access method arguments if needed
    }
}
