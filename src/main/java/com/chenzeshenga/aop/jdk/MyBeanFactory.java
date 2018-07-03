/**
 * @FILE_NAME MyBeanFactory.java
 * @AUTHOR chenz
 * @DATE 2018Äê7ÔÂ3ÈÕ
 */
package com.chenzeshenga.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {

	public static IUserService createUserService() {
		IUserService userService = new UserServiceImpl();
		MyAspect myAspect = new MyAspect();

		IUserService proxyService = (IUserService) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(),
				userService.getClass().getInterfaces(), new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						myAspect.before();
						Object obj = method.invoke(userService, args);
						myAspect.after();
						return obj;
					}
				});

		return proxyService;
	}
}
