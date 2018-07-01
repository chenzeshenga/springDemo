/**
 * @FILE_NAME TestIoC.java
 * @AUTHOR chenz
 * @DATE 2018Äê6ÔÂ29ÈÕ
 */
package com.chenzeshenga.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {

	@Test
	public void demo01() {
		String xmlPath = "beans-lifecycle.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		UserServiceImpl userService1 = (UserServiceImpl) applicationContext.getBean("userService");

		userService1.addUser();
//		try {
//			applicationContext.getClass().getMethod("close").invoke(applicationContext);
//		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
//				| SecurityException e) {
//			e.printStackTrace();
//		}
//		applicationContext.close();
	}

	@Test
	public void demo02() {
		String xmlPath = "beans-lifecycle.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		MyBeanPostProcessor processor = (MyBeanPostProcessor) applicationContext.getBean("postprocessor");

		applicationContext.close();
	}

	@Test
	public void demo03() {
		String xmlPath = "beans-lifecycle.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		IUserService userService1 = (IUserService) applicationContext.getBean("userService");

		userService1.addUser();
	}
}
