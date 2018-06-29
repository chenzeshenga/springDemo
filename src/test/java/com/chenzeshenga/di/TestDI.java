/**
 * @FILE_NAME TestDI.java
 * @AUTHOR chenz
 * @DATE 2018年6月29日
 */
package com.chenzeshenga.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.chenzeshenga.di.impl.BookServiceImpl;

public class TestDI {

	@Test
	public void demo01() {
		String xmlPath = "beans-di.xml";
		//加载好xml文件之后就完成bean的创建
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		BookServiceImpl bookServiceImpl = (BookServiceImpl) applicationContext.getBean("bookService");
		bookServiceImpl.addBook();
	}

	@Test
	public void demo02() {
		String xmlPath = "beans-di.xml";
		//延迟创建bean，在第一次getbean时才创建需要的bean
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(xmlPath));

		BookServiceImpl bookServiceImpl = (BookServiceImpl) beanFactory.getBean("bookService");
		bookServiceImpl.addBook();
	}

}
