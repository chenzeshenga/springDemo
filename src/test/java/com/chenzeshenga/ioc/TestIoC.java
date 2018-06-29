/**
 * @FILE_NAME TestIoC.java
 * @AUTHOR chenz
 * @DATE 2018Äê6ÔÂ29ÈÕ
 */
package com.chenzeshenga.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {

	@Test
	public void demo01() {
		UserServiceImpl userService = new UserServiceImpl();
		userService.addUser();
	}

	@Test
	public void demo02() {
		String xmlPath = "beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userService");
		userService.addUser();
	}
}
