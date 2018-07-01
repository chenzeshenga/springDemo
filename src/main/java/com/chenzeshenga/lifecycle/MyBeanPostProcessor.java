/**
 * @FILE_NAME MyBeanPostProcessor.java
 * @AUTHOR chenz
 * @DATE 2018年7月1日
 */
package com.chenzeshenga.lifecycle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// BeanPostProcessor
// Factory hook that allows for custom modification of new bean instances,
// e.g. checking for marker interfaces or wrapping them with proxies.
// spring 提供工厂钩子，用于修改实例对象，可以生产代理对象，是aop的低层原理

// postProcessAfterInitialization(Object bean, String beanName)
//
// postProcessBeforeInitialization(Object bean, String beanName)

//后处理bean作用于全部目标类
public class MyBeanPostProcessor implements BeanPostProcessor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#
	 * postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before bean");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#
	 * postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
		System.out.println("after bean");
		// 生成代理
		return Proxy.newProxyInstance(MyBeanPostProcessor.class.getClassLoader(), bean.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("proxy");
						System.out.println("start transaction");
						Object obj = method.invoke(bean, args);
						System.out.println("commit transaction");
						return obj;
					}
				});
//		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
