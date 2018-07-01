/**
 * @FILE_NAME UserServiceImpl.java
 * @AUTHOR chenz
 * @DATE 2018Äê6ÔÂ29ÈÕ
 */
package com.chenzeshenga.lifecycle;

public class UserServiceImpl implements IUserService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.chenzeshenga.ioc.IUserService#addUser()
	 */
	@Override
	public void addUser() {
		System.out.println("add user");
	}

	public void myInit() {
		System.out.println("init");
	}

	public void myDestroy() {
		System.out.println("destory");
	}

}
