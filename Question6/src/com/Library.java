package com;

import com.Book;
import java.util.*;

public class Library extends Book {

	ArrayList<Book> booklist = new ArrayList<Book>();
	
	void addBook(Book b) {
		booklist.add(b);
	}
	
	boolean isEmpty() {
		return booklist.isEmpty();
	}
	
	ArrayList<Book> viewAllBooks() {
		return booklist;
	}
	
	ArrayList<Book> viewBooksByAuthor() {
		
		Iterator i = booklist.iterator();
		
		return null;
	}
	
	
}
