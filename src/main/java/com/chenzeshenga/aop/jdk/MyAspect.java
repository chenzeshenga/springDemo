/**
 * @FILE_NAME MyAspect.java
 * @AUTHOR chenz
 * @DATE 2018��7��3��
 */
package com.chenzeshenga.aop.jdk;

public class MyAspect {

	public void before() {
		System.out.println("aspect before");
	}

	public void after() {
		System.out.println("aspect after");
	}
}
