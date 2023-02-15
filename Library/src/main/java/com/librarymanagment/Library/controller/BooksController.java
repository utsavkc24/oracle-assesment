package com.librarymanagment.Library.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagment.Library.exception.BookNotFoundException;
import com.librarymanagment.Library.model.Book;
import com.librarymanagment.Library.service.BookService;

@RestController
public class BooksController {

	@Autowired
	private BookService service;

	@PostMapping("/books")
	public void addBook(@RequestBody Book book) {
		service.add(book);
	}

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return service.getAllBooks();
	}

	@GetMapping("/books/{id}")
	public Optional<Book> getBookById(@PathVariable int id) {
		Optional<Book> book = service.getBookById(id);

		if (!book.isPresent())
			throw new BookNotFoundException("id-" + id);

		return book;
	}

	@DeleteMapping("/books/{id}")
	public void deleteBookById(@PathVariable int id) {
		Optional<Book> book = service.getBookById(id);
		if (!book.isPresent())
			throw new BookNotFoundException("id-" + id);

		service.deleteBookById(id);
	}
}
