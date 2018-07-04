/**
 * @FILE_NAME UserServiceImpl.java
 * @AUTHOR chenz
 * @DATE 2018Äê7ÔÂ3ÈÕ
 */
package com.chenzeshenga.aspect.annotation;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.chenzeshenga.aop.aspect.IUserService#addUser()
	 */
	@Override
	public void addUser() {
		System.out.println("aspect add user");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.chenzeshenga.aop.aspect.IUserService#updateUser()
	 */
	@Override
	public void updateUser() {
		System.out.println("aspect update user");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.chenzeshenga.aop.aspect.IUserService#deleteUser()
	 */
	@Override
	public void deleteUser() {
		System.out.println("aspect delete user");
	}

}
