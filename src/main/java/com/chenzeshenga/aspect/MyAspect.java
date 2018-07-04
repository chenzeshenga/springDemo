/**
 * @FILE_NAME MyAspect.java
 * @AUTHOR chenz
 * @DATE 2018Äê7ÔÂ3ÈÕ
 */
package com.chenzeshenga.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	public void before(JoinPoint joinPoint) {
		System.out.println("before: -->" + joinPoint.getSignature().getName());
	}

	public void after(JoinPoint joinPoint, Object returning) {
		System.out.println("after: -->" + joinPoint.getSignature().getName() + ", -->" + returning);
	}

	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("before");
		Object obj = proceedingJoinPoint.proceed();
		System.out.println("after");
		return obj;
	}
}
