/**
 * @FILE_NAME TestDI.java
 * @AUTHOR chenz
 * @DATE 2018年6月29日
 */
package com.chenzeshenga.setter;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chenzeshenga.setter.Person;

public class TestSetter {

	@Test
	public void demo01() {
		String xmlPath = "beans-setter.xml";
		// 加载好xml文件之后就完成bean的创建
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		Person user = (Person) applicationContext.getBean("person");
		System.out.println(user);
	}

}
