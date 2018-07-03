/**
 * @FILE_NAME TestJDK.java
 * @AUTHOR chenz
 * @DATE 2018��7��3��
 */
package com.chenzeshenga.aop.cglib;

import org.junit.jupiter.api.Test;

public class TestCGLIB {

	@Test
	public void demo01() {
		UserServiceImpl userService = MyBeanFactory.createUserService();
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}
