/**
 * @FILE_NAME UserServiceImpl.java
 * @AUTHOR chenz
 * @DATE 2018Äê7ÔÂ3ÈÕ
 */
package com.chenzeshenga.aop.spring_aop;

public class UserServiceImpl implements IUserService {

	/*
	 * (non-Javadoc)
	 * 
	 */
	@Override
	public void addUser() {
		System.out.println("spring_aop add user");
	}

	/*
	 * (non-Javadoc)
	 * 
	 */
	@Override
	public void updateUser() {
		System.out.println("spring_aop update user");
	}

	/*
	 * (non-Javadoc)
	 * 
	 */
	@Override
	public void deleteUser() {
		System.out.println("spring_aop delete user");
	}

}
