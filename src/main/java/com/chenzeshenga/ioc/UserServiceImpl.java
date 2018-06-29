/**
 * @FILE_NAME UserServiceImpl.java
 * @AUTHOR chenz
 * @DATE 2018��6��29��
 */
package com.chenzeshenga.ioc;

public class UserServiceImpl implements IUserService {

	/* (non-Javadoc)
	 * @see com.chenzeshenga.ioc.IUserService#addUser()
	 */
	@Override
	public void addUser() {
		System.out.println("ioc add user");
	}

}
