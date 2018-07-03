/**
 * @FILE_NAME MyBeanFactory.java
 * @AUTHOR chenz
 * @DATE 2018Äê7ÔÂ3ÈÕ
 */
package com.chenzeshenga.aop.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyBeanFactory {

	public static UserServiceImpl createUserService() {
		UserServiceImpl userService = new UserServiceImpl();
		MyAspect myAspect = new MyAspect();

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(userService.getClass());

		enhancer.setCallback(new MethodInterceptor() {

			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy)
					throws Throwable {
				myAspect.before();
				Object obj = method.invoke(userService, args);
				myAspect.after();
				return obj;
			}
		});
		UserServiceImpl proxyService = (UserServiceImpl) enhancer.create();
		return proxyService;
	}
}
