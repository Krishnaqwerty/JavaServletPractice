package com.mphasis.firstaopapp.aspect;

import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value = 1)
public class SystemCheckAspect {
	
//	@Before("execution(* com.mphasis.firstaopapp.service.*.*(..))")
	public void systemCheckBefore() {
		
		System.out.println("System Check beore... " + LocalDateTime.now());
	}
	
	
//	@After("execution(* com.mphasis.firstaopapp.service.*.*(..))")
	public void systemCheckAfter() {
			
			System.out.println("System Check after... " + LocalDateTime.now());
	}
	
	
	@Around("execution(* com.mphasis.firstaopapp.service.*.*(..))")
	public void beforeAndAfter(ProceedingJoinPoint pj) {
		
		systemCheckBefore();
		try {
			pj.proceed();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		systemCheckAfter();
	}


}
