package com.librarymanagment.Library.service;

import java.util.List;

import com.librarymanagment.Library.model.Book;

public interface BookServiceInterface {

	public void add(Book book);

	public List<Book> getAllBooks();

	public Book getBookById(int id);

	public void update(Book book);

	public void deleteBookById(int id);
}
