package com.capgemini.labbook.service;

import com.capgemini.labbook.entities.Author;

public interface IAuthorService {

	String addAuthor(Author author);
	String updateAuthor(Author author);
	String deleteAuthor(int authorId);
	Author fetch(int authorId);
}
