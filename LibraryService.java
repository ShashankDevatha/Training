package com.vir.service;
import com.vir.*;
import com.vir.model.Book;
public class LibraryService {
	public static void main(String args[])
	{
		BookService bookService = new BookServiceImpl();
		Book book101=bookService.findById(101);
		System.out.println(book101);
		book101.setPrice(450);
		System.out.println(book101);
		bookService.deleteBook(book101);
		Book book = bookService.findById(101);
		if(book==null)
		{
			System.out.println();
		}
	}
	
}
