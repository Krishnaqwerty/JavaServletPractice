package com.mphasis.firstaopapp.aspect;

import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
//	@Before("execution(* com.mphasis.firstaopapp.service.*.*(..))")
	public void logBefore() {
		
		System.out.println("Log beore... " + LocalDateTime.now());
	}
	
	
//	@After("execution(* com.mphasis.firstaopapp.service.*.*(..))")
	public void logAfter() {
			
			System.out.println("Log after... " + LocalDateTime.now());
	}
	
	
	@Around("execution(* com.mphasis.firstaopapp.service.*.*(..))")
	public void beforeAndAfter(ProceedingJoinPoint pj) {
		
		logBefore();
		try {
			pj.proceed();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		logAfter();
	}

}
