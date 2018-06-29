/**
 * @FILE_NAME UserServiceImpl.java
 * @AUTHOR chenz
 * @DATE 2018��6��29��
 */
package com.chenzeshenga.inject.non_static_factory;

public class UserServiceImpl implements IUserService {

	/* (non-Javadoc)
	 * @see com.chenzeshenga.ioc.IUserService#addUser()
	 */
	@Override
	public void addUser() {
		System.out.println("add user");
	}

}
