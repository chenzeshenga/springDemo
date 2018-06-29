/**
 * @FILE_NAME TestDI.java
 * @AUTHOR chenz
 * @DATE 2018��6��29��
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
		//���غ�xml�ļ�֮������bean�Ĵ���
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		BookServiceImpl bookServiceImpl = (BookServiceImpl) applicationContext.getBean("bookService");
		bookServiceImpl.addBook();
	}

	@Test
	public void demo02() {
		String xmlPath = "beans-di.xml";
		//�ӳٴ���bean���ڵ�һ��getbeanʱ�Ŵ�����Ҫ��bean
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(xmlPath));

		BookServiceImpl bookServiceImpl = (BookServiceImpl) beanFactory.getBean("bookService");
		bookServiceImpl.addBook();
	}

}
