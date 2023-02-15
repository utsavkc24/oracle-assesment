package com.librarymanagment.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.librarymanagment.Library.controller.BooksController;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {

	@Autowired
	private BooksController book;

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Course course = courseRepository.findById(10001L);
		// LOGGER.info("Course with id 100001 --> " + course.getName());

		// Course course = courseRepository.save(new Course("DSA"));
		// LOGGER.info("Saving course .... " + course.getName());

		// courseRepository.playWithEntityManager();

		// studentRepository.saveStudentWithPassport();
		// courseRepository.addHardcodedReviewForCourses();

		// List<Review> reviews = new ArrayList<>();
		// reviews.add(new Review("5", "Very Good"));
		// reviews.add(new Review("1", "Not so good"));

		// courseRepository.addReviewForCourses(10003L, reviews);

		// studentRepository.insertStudentAndCourse(new Student("Jonas"), new
		// Course("Time travel"));
		// book.addBook(new Book("Harry Potter", "JK Rowling"));

	}

}
