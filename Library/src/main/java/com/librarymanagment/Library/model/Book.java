package com.librarymanagment.Library.model;

import javax.validation.constraints.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull(message = "Name cannot be null")
	@Size(min = 10, max = 200, message = "Name must be between 10 and 200 characters")
	private String name;

	@NotNull(message = "Name cannot be null")
	@Size(min = 10, max = 200, message = "Name must be between 10 and 200 characters")
	private String author;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
