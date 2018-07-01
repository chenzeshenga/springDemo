/**
 * @FILE_NAME MyBeanFactory.java
 * @AUTHOR chenz
 * @DATE 2018Äê6ÔÂ29ÈÕ
 */
package com.chenzeshenga.lifecycle;

public class MyBeanFactory {

	public static UserServiceImpl getUserService() {
		return new UserServiceImpl();
	}
}
