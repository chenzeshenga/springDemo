/**
 * @FILE_NAME UserServiceImpl.java
 * @AUTHOR chenz
 * @DATE 2018Äê7ÔÂ3ÈÕ
 */
package com.chenzeshenga.aop.factory_bean;

public class UserServiceImpl implements IUserService {

	/*
	 * (non-Javadoc)
	 * 
	 */
	@Override
	public void addUser() {
		System.out.println("factory_bean add user");
	}

	/*
	 * (non-Javadoc)
	 * 
	 */
	@Override
	public void updateUser() {
		System.out.println("factory_bean update user");
	}

	/*
	 * (non-Javadoc)
	 * 
	 */
	@Override
	public void deleteUser() {
		System.out.println("factory_bean delete user");
	}

}
