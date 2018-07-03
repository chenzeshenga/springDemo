/**
 * @FILE_NAME UserServiceImpl.java
 * @AUTHOR chenz
 * @DATE 2018Äê7ÔÂ3ÈÕ
 */
package com.chenzeshenga.aop.jdk;

public class UserServiceImpl implements IUserService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.chenzeshenga.aop.jdk.IUserService#addUser()
	 */
	@Override
	public void addUser() {
		System.out.println("jdk add user");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.chenzeshenga.aop.jdk.IUserService#updateUser()
	 */
	@Override
	public void updateUser() {
		System.out.println("jdk update user");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.chenzeshenga.aop.jdk.IUserService#deleteUser()
	 */
	@Override
	public void deleteUser() {
		System.out.println("jdk delete user");
	}

}
