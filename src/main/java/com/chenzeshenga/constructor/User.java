/**
 * @FILE_NAME User.java
 * @AUTHOR chenz
 * @DATE 2018Äê7ÔÂ1ÈÕ
 */
package com.chenzeshenga.constructor;

public class User {

	private Integer uid;
	private String username;
	private Integer age;

	/**
	 * @param uid
	 * @param username
	 */
	public User(Integer uid, String username) {
		super();
		this.uid = uid;
		this.username = username;
	}

	/**
	 * @param username
	 * @param age
	 */
	public User(String username, Integer age) {
		super();
		this.username = username;
		this.age = age;
	}

	/**
	 * @return the uid
	 */
	public Integer getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", age=" + age + "]";
	}

}
