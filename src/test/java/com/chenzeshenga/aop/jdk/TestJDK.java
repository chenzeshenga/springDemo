/**
 * @FILE_NAME TestJDK.java
 * @AUTHOR chenz
 * @DATE 2018��7��3��
 */
package com.chenzeshenga.aop.jdk;

import org.junit.jupiter.api.Test;

public class TestJDK {

	@Test
	public void demo01() {
		IUserService userService= MyBeanFactory.createUserService();
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}
