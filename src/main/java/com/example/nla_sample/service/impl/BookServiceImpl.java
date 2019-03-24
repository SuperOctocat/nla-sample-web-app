package com.example.nla_sample.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.nla_sample.model.Book;
import com.example.nla_sample.repository.BookRepository;
import com.example.nla_sample.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	@Autowired
    private JdbcTemplate jtm;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Book> getAllBooks() {
		/*List<Book> books = new ArrayList<>();
		bookRepository.findAll()
		.forEach(books::add);
		return books;*/
		String sql = "SELECT * FROM BOOKS";
        List<Book> books = jtm.query(sql, new BeanPropertyRowMapper(Book.class));
        return books;
	}
	
	@Override
	public Optional<Book> getBook(Long id) {
		return bookRepository.findById(id);
	}
	
	@Override
	public void addBook(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void updateBook(Long id, Book book) {
		bookRepository.save(book);		
	}

	@Override
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);	
	}

	@Override
	public void lendBookToUser(Book book) {
		bookRepository.save(book);
		
	}

	@Override
	public void returnedBookFromUser(Long userId, Long id) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Book> getAllBooksBorrowedByUser(Long userId) {
		StringBuilder sb = new StringBuilder("SELECT distinct b.*  FROM BOOKS b inner join USERS u on b.USER = 1");
		//System.out.println(userId);
		//sb.append(userId);
		String sql = sb.toString();
		List<Book> books = jtm.query(sql, new BeanPropertyRowMapper(Book.class));
        return books;
	}

	@Override
	public List<Book> getAllAvailableBooks(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBorrowedBooks(String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
