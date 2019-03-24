package com.example.nla_sample.service;

import java.util.List;
import java.util.Optional;

import com.example.nla_sample.model.Book;

public interface BookService {
	
	List<Book> getAllBooks();
	
	Optional<Book> getBook(Long id);
	
	void addBook(Book book);
	
	void updateBook(Long id, Book book);
	
	void deleteBook(Long id);
	
	void lendBookToUser(Book book);
	
	void returnedBookFromUser(Long userId, Long id);
	
	List<Book> getAllBooksBorrowedByUser(Long id);
	
	List<Book> getAllAvailableBooks(String status);
	
	List<Book> getAllBorrowedBooks(String status);
}

