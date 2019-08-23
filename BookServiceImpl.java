package com.vir.service;

import com.vir.dao.BookDao;
import com.vir.model.Book;
import com.vir.dao.BookDaoImpl;


public class BookServiceImpl implements BookService {
	private BookDao bookDao=new BookDaoImpl();
	
	@Override
	public Book findById(int bid) {
		return bookDao.findById(bid);
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		
		return bookDao.addBook(book);
	}

	@Override
	public Book deleteBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.deleteBook(book);
	}

	@Override
	public void addBooksOfSameType(Book book, int number) {
		// TODO Auto-generated method stub
		for(int i=1;i<=number;i++)
			bookDao.addBook(book);
		
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.updateBook(book);
	}
	
	

}
