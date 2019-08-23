package com.vir.dao;

import com.vir.model.Book;
import java.util.*;

public class BookDaoImpl implements BookDao {
	private static HashMap<Integer,Book> booksMap=new HashMap<>();
	static
	{
		Book b =new Book(101,"Java Programming","H Schildt" ,6,400);
		booksMap.put(101, b);
		Book b2 =new Book(102,"Java Servlet","O Schildt" ,4,500);
		booksMap.put(102, b2);
		Book b3 =new Book(103,"C Programming","O Reily",5,600);
		booksMap.put(103, b3);
		Book b4 =new Book(104,"Spring Programming","H Schildt and O reily",6,400);
		booksMap.put(104, b4);
		Book b5 =new Book(105,"Java Programming","H Schildt",5,800);
		booksMap.put(105, b5);
	}
	
	@Override
	public Book findById(int bid) {
		return booksMap.get(bid);
	}
	@Override
	public Book updateBook(Book book)
	{
		return booksMap.put(book.getBookid(), book);
	}
	
	@Override
	public Book addBook(Book book)
	{
		int maxkey=Collections.max(booksMap.keySet());
		return booksMap.put(maxkey +1, book);
	}
	public Book deleteBook(Book book)
	{
		int maxkey=Collections.max(booksMap.keySet());
		return booksMap.remove(book.getBookid());
	}

}
