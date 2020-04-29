package com.capgemini.labbook.dao;

import com.capgemini.labbook.entities.Author;

public interface IAuthorDao {

	String addAuthor(Author author);
	String updateAuthor(Author author);
	String deleteAuthor(int authorId);
	Author fetch(int authorId);
}
