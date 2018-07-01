/**
 * @FILE_NAME Address.java
 * @AUTHOR chenz
 * @DATE 2018��7��1��
 */
package com.chenzeshenga.setter;

public class Address {

	private String addr;
	private String tel;

	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [addr=" + addr + ", tel=" + tel + "]";
	}

}
