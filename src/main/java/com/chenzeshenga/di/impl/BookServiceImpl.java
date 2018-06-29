/**
 * @FILE_NAME BookServiceImpl.java
 * @AUTHOR chenz
 * @DATE 2018Äê6ÔÂ29ÈÕ
 */
package com.chenzeshenga.di.impl;

import com.chenzeshenga.di.IBookDao;
import com.chenzeshenga.di.IBookService;

public class BookServiceImpl implements IBookService {

	private IBookDao bookDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.chenzeshenga.di.IBookService#addBook()
	 */
	@Override
	public void addBook() {
		System.out.println("DI BookServiceImpl");
	}

	/**
	 * @return the bookDao
	 */
	public IBookDao getBookDao() {
		return bookDao;
	}

	/**
	 * @param bookDao the bookDao to set
	 */
	public void setBookDao(IBookDao bookDao) {
		this.bookDao = bookDao;
	}

}
