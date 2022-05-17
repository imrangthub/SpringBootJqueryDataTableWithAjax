package com.imran.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imran.model.BookAuthor;
import com.imran.repository.BookAuthorRepository;

@Service("userService")
public class BookAuthorService {

	@Autowired
	private BookAuthorRepository bookAuthorRepository;

	public List<BookAuthor> list() {

		return bookAuthorRepository.findAll();

	}

	public void saveAuthor(BookAuthor bookAuthor) {
		bookAuthorRepository.save(bookAuthor);

	}

	public BookAuthor authorById(Long bookAuthorId) {
		return bookAuthorRepository.findOne(bookAuthorId);

	}

	public void delete(Long authorId) {
		bookAuthorRepository.delete(authorId);

	}

}
