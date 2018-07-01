/**
 * @FILE_NAME TestDI.java
 * @AUTHOR chenz
 * @DATE 2018��6��29��
 */
package com.chenzeshenga.constructor;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {

	@Test
	public void demo01() {
		String xmlPath = "beans-constructor.xml";
		//���غ�xml�ļ�֮������bean�Ĵ���
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
	}


}
