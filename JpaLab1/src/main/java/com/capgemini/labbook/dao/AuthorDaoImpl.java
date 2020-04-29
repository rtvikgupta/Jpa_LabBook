package com.capgemini.labbook.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.labbook.entities.Author;

public class AuthorDaoImpl implements IAuthorDao{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("connect");
	EntityManager em ;
	
	public String addAuthor(Author author) {
		em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(author);
		em.getTransaction().commit();
		em.close();		
		return "Added";
	}

	public String updateAuthor(Author author) {
		em = emf.createEntityManager();
		Author auth = em.find(Author.class,author.getAuthorId());
		em.getTransaction().begin();
		auth.setFirstName(author.getFirstName());
		auth.setMiddleName(author.getMiddleName());
		auth.setLastName(author.getLastName());
		auth.setPhoneNo(author.getPhoneNo());
		em.getTransaction().commit();
		em.close();
		return "Updated";
		
	}

	public String deleteAuthor(int authorId) {
		em=emf.createEntityManager();
		Author delete = em.find(Author.class, authorId);
		em.getTransaction().begin();
		em.remove(delete);
		em.getTransaction().commit();
		em.close();	
		return "Deleted";
		
	}

	public Author fetch(int authorId) {
		em=emf.createEntityManager();
		Author fetched=em.find(Author.class, authorId);
		return fetched;
	}

}
