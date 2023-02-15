package com.librarymanagment.Library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymanagment.Library.model.Book;
import com.librarymanagment.Library.repository.BookRepository;

@Service
public class BookService implements BookServiceInterface {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public void add(Book book) {
		bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Optional<Book> getBookById(int id) {
		return bookRepository.findById(id);
	}

	@Override
	public void update(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void deleteBookById(int id) {
		bookRepository.deleteById(id);
	}
}
