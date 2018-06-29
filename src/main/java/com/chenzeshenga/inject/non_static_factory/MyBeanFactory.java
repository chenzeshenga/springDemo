/**
 * @FILE_NAME MyBeanFactory.java
 * @AUTHOR chenz
 * @DATE 2018Äê6ÔÂ29ÈÕ
 */
package com.chenzeshenga.inject.non_static_factory;

public class MyBeanFactory {

	public UserServiceImpl getUserService() {
		return new UserServiceImpl();
	}
}
