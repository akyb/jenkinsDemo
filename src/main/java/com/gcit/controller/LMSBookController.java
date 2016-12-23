package com.gcit.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcit.domain.Author;

@RestController
public class LMSBookController {

	@RequestMapping("/book/{bookId}")
	public Author getAuthor(@PathVariable(value = "bookId") int bookId) {
		Author author = new Author();
		author.setAuthorId(bookId);
		author.setAuthorName("bookName");
		return author;
	}
}
