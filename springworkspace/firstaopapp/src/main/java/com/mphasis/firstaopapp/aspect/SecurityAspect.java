package com.mphasis.firstaopapp.aspect;

import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value = 2)
public class SecurityAspect {
	
//	@Before("execution(* com.mphasis.firstaopapp.service.*.*(..))")
	public void securityBefore() {
		
		System.out.println("Security beore... " + LocalDateTime.now());
	}
	
	
//	@After("execution(* com.mphasis.firstaopapp.service.*.*(..))")
	public void securityAfter() {
			
			System.out.println("Security after... " + LocalDateTime.now());
	}
	
	
	@Around("execution(* com.mphasis.firstaopapp.service.*.*(..))")
	public void beforeAndAfter(ProceedingJoinPoint pj) {
		
		securityBefore();
		try {
			pj.proceed();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		securityAfter();
	}

}
