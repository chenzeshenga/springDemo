/**
 * @FILE_NAME TestDI.java
 * @AUTHOR chenz
 * @DATE 2018��6��29��
 */
package com.chenzeshenga.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chenzeshenga.di.impl.BookServiceImpl;

public class TestDI {
	
	@Test
	public void demo01() {
		String xmlPath = "beans-di.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		BookServiceImpl bookServiceImpl = (BookServiceImpl) applicationContext.getBean("bookService");
		bookServiceImpl.addBook();
	}

}
