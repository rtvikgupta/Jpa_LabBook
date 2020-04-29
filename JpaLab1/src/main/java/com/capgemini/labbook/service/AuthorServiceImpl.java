package com.capgemini.labbook.service;

import com.capgemini.labbook.dao.AuthorDaoImpl;
import com.capgemini.labbook.entities.Author;

public class AuthorServiceImpl implements IAuthorService{
	
	AuthorDaoImpl authorDao = new AuthorDaoImpl();
	public String addAuthor(Author author) {
		String result= authorDao.addAuthor(author);
		return result;
		
	}

	public String updateAuthor(Author author) {
		String result= authorDao.updateAuthor(author);
		return result;
		
	}

	public String deleteAuthor(int authorId) {
		String result= authorDao.deleteAuthor(authorId);
		return result;
		
	}

	public Author fetch(int authorId) {
		return authorDao.fetch(authorId);
	}

}
