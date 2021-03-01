package com.gcit.controller;

import java.sql.SQLException;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.gcit.dao.AuthorDao;
import com.gcit.domain.Author;

@RestController
public class LMSAuthorController {

	// @Autowired
	// AuthorDao authorDao = new AuthorDao();
	@RequestMapping("/author/{authorId}")
	public Author getAuthor(@PathVariable(value = "authorId") int authorId) throws SQLException {
		// Author author = authorDao.getAuthorById(authorId);
		Author author = new Author();
		author.setAuthorId(authorId);
		author.setAuthorName("name "+authorId);
		return author;
	}
}
