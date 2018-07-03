/**
 * @FILE_NAME TestJDK.java
 * @AUTHOR chenz
 * @DATE 2018Äê7ÔÂ3ÈÕ
 */
package com.chenzeshenga.aop.spring_aop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAop {

	@Test
	public void demo01() {
		String path = "beans-spring-aop.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);

		IUserService userService = (IUserService) applicationContext.getBean("userService");
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}
