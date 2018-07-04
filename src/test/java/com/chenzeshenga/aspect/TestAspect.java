/**
 * @FILE_NAME TestJDK.java
 * @AUTHOR chenz
 * @DATE 2018Äê7ÔÂ3ÈÕ
 */
package com.chenzeshenga.aspect;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspect {

	@Test
	public void demo01() {
		String xml = "beans-aspect.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);

		IUserService userService = (IUserService) applicationContext.getBean("userService");

		userService.addUser();
		userService.updateUser();
		userService.deleteUser();

	}
}
