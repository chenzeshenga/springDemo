/**
 * @FILE_NAME MyBeanFactory.java
 * @AUTHOR chenz
 * @DATE 2018��6��29��
 */
package com.chenzeshenga.scope;

public class MyBeanFactory {

	public static UserServiceImpl getUserService() {
		return new UserServiceImpl();
	}
}
