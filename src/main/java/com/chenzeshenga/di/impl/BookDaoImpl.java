/**
 * @FILE_NAME BookDaoImpl.java
 * @AUTHOR chenz
 * @DATE 2018��6��29��
 */
package com.chenzeshenga.di.impl;

import com.chenzeshenga.di.IBookDao;

public class BookDaoImpl implements IBookDao{

	/* (non-Javadoc)
	 * @see com.chenzeshenga.di.IBookDao#addBook()
	 */
	@Override
	public void addBook() {
		System.out.println("DI BookDaoImpl");
	}

}
