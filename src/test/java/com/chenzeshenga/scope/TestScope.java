/**
 * @FILE_NAME TestIoC.java
 * @AUTHOR chenz
 * @DATE 2018Äê6ÔÂ29ÈÕ
 */
package com.chenzeshenga.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {


	@Test
	public void demo02() {
		String xmlPath = "beans-scope.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		UserServiceImpl userService1 = (UserServiceImpl) applicationContext.getBean("userService");
		UserServiceImpl userService2 = (UserServiceImpl) applicationContext.getBean("userService");
		
		System.out.println(userService1);
		System.out.println(userService2);
	}
}
