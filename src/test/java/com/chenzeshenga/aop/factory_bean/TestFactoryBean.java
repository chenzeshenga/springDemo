/**
 * @FILE_NAME TestJDK.java
 * @AUTHOR chenz
 * @DATE 2018Äê7ÔÂ3ÈÕ
 */
package com.chenzeshenga.aop.factory_bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {

	@Test
	public void demo01() {
		String path="beans-aop-factorybean.xml";
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext(path);
		
		IUserService userService = (IUserService) applicationContext.getBean("proxyService");
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}
