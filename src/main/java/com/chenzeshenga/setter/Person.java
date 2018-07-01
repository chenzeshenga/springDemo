/**
 * @FILE_NAME Person.java
 * @AUTHOR chenz
 * @DATE 2018Äê7ÔÂ1ÈÕ
 */
package com.chenzeshenga.setter;

public class Person {

	private String pname;
	private Integer age;
	private Address address;
	private Address homeaddr;

	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
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

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the homeaddr
	 */
	public Address getHomeaddr() {
		return homeaddr;
	}

	/**
	 * @param homeaddr the homeaddr to set
	 */
	public void setHomeaddr(Address homeaddr) {
		this.homeaddr = homeaddr;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", age=" + age + ", address=" + address + ", homeaddr=" + homeaddr + "]";
	}

}
