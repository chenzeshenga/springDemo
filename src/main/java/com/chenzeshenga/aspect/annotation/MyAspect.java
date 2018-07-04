/**
 * @FILE_NAME MyAspect.java
 * @AUTHOR chenz
 * @DATE 2018Äê7ÔÂ3ÈÕ
 */
package com.chenzeshenga.aspect.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {

	@Before("execution(* com.chenzeshenga.aspect.annotation.UserServiceImpl.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("before: -->" + joinPoint.getSignature().getName());
	}

	@Pointcut("execution(* com.chenzeshenga.aspect.annotation.UserServiceImpl.*(..))")
	private void myPointCut() {

	}

	@AfterReturning(value = "myPointCut()", returning = "returning")
	public void after(JoinPoint joinPoint, Object returning) {
		System.out.println("after: -->" + joinPoint.getSignature().getName() + ", -->" + returning);
	}

	@Around(value = "myPointCut()")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("before");
		Object obj = proceedingJoinPoint.proceed();
		System.out.println("after");
		return obj;
	}
}
