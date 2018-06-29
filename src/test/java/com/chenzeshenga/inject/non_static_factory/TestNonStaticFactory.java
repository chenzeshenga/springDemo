package com.chenzeshenga.inject.non_static_factory;
/**
 * @FILE_NAME TestIoC.java
 * @AUTHOR chenz
 * @DATE 2018Äê6ÔÂ29ÈÕ
 */

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNonStaticFactory {

	@Test
	public void demo01() {
		String xmlPath = "beans-non-static-factory.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		UserServiceImpl userService = applicationContext.getBean("userService", UserServiceImpl.class);
		userService.addUser();
	}
}
