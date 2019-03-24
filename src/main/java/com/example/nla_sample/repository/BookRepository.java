package com.example.nla_sample.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.nla_sample.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
