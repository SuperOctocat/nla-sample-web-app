package com.example.nla_sample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.nla_sample.model.Book;
import com.example.nla_sample.model.User;
import com.example.nla_sample.service.impl.BookServiceImpl;

@RestController
public class BookController {
	
	@Autowired
	private BookServiceImpl bookService; 
	
	@RequestMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	@RequestMapping("/books/{id}")
	public Optional<Book> getBook(@PathVariable Long id) {
		return bookService.getBook(id);
	}
	
	@PostMapping("/books")
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}
	
	@PutMapping("/books/{id}")
	public void updateBook(@RequestBody Book book, @PathVariable Long id) {
		bookService.updateBook(id, book);
	}
	
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable Long id) {
		bookService.deleteBook(id);
	}
	
	@PostMapping("/users/{userId}/books")
	public void lendBookToUser(@RequestBody Book book, Long userId) {
		book.setUser(new User(userId, "", "", "", ""));
		bookService.addBook(book);
	}
	
	@DeleteMapping("/users/{userId}/books/{id}")
	public void returnedBookFromUser(Long userId, Long id) {
		bookService.returnedBookFromUser(userId, id);
	}
	
	/*@RequestMapping("/showBooks/{userId}")
	public List<Book> getAllBorrowedBooksByUser(Long userId) {
		return bookService.getAllBooksBorrowedByUser(userId);
	}*/
	
	@RequestMapping("/showBooks/{userId}")
	public ModelAndView getAllBorrowedBooksByUser(Long userId) {
		System.out.println("id from controller" + userId);
		List<Book> books = bookService.getAllBooksBorrowedByUser(userId);
        Map<String, Object> params = new HashMap<>();
        params.put("books", books);
        return new ModelAndView("showBooksByUser", params);
	}
	
	
	/*@RequestMapping("/books/{status}")
	public List<Book> getAllAvailableBooks(String status) {
		return bookService.getAllAvailableBooks(status);
	}*/
	
	/*@RequestMapping("/books/{status}")
	public List<Book> getAllBorrowedBooks(String status) {
		return bookService.getAllBorrowedBooks(status);
	}*/
	
	@RequestMapping("/showBooks")
    public ModelAndView showBooks() {
        List<Book> books = bookService.getAllBooks();
        Map<String, Object> params = new HashMap<>();
        params.put("books", books);
        return new ModelAndView("showBooks", params);
    }

}
