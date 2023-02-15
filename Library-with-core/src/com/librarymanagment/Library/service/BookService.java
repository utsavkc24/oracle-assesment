package com.librarymanagment.Library.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.librarymanagment.Library.exception.BookNotFoundException;
import com.librarymanagment.Library.model.Book;
import com.librarymanagment.Library.repository.BookRepository;

public class BookService implements BookServiceInterface {

	private HashMap<Integer, Book> db = BookRepository.getDBInstance();

	@Override
	public void add(Book book) {
		int ID = book.getId();
		db.put(ID, book);
	}

	@Override
	public List<Book> getAllBooks() {
		return db.values().stream().collect(Collectors.toList());

	}

	@Override
	public Book getBookById(int id) {
		Book book = db.get(id);

		if (book == null)
			throw new BookNotFoundException("Book with this ID:" + id + "is not present");

		return book;
	}

	@Override
	public void update(Book book) {
		db.put(book.getId(), book);
	}

	@Override
	public void deleteBookById(int id) {
		Optional<Book> book = Optional.of(db.get(id));

		if (book.isPresent()) {
			db.remove(id);
		} else {
			throw new BookNotFoundException("Book with this ID:" + id + "is not present");
		}
	}

}
