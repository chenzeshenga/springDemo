/**
 * @FILE_NAME MyBeanFactory.java
 * @AUTHOR chenz
 * @DATE 2018��6��29��
 */
package com.chenzeshenga.inject.non_static_factory;

public class MyBeanFactory {

	public UserServiceImpl getUserService() {
		return new UserServiceImpl();
	}
}
