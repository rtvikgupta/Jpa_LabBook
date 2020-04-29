package com.capgemini.labbook.controller;

import java.util.Scanner;

import javax.persistence.Persistence;

import com.capgemini.labbook.entities.Author;
import com.capgemini.labbook.service.AuthorServiceImpl;

public class MainController {
	
	static Scanner scn = new Scanner(System.in);
	static AuthorServiceImpl authorService = new AuthorServiceImpl();
	
	public static void main(String[] args) {
		int ch=0;
		do {
			System.out.println("Enter your choice :");
			System.out.println("1. Save");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Fetch");
			System.out.println("5. Exit");
			ch=scn.nextInt();
			switch(ch) {
			case 1: doSave();break;
			case 2: doUpdate();break;
			case 3: doDelete();break;
			case 4: doFetch();break;
			case 5:System.out.println("Exit"); 
				System.exit(0);
			default: System.out.println("Wrong choice");
			}
		}while(ch!=5);
		
		
	}
	static void doSave() {
		System.out.println("Enter the Author Id:");
		int id=scn.nextInt();
		System.out.println("Enter the Author FirstName:");
		String firstName=scn.next();
		System.out.println("Enter the Author MiddleName:");
		String middleName=scn.next();
		System.out.println("Enter the Author LastName:");
		String lastName=scn.next();
		System.out.println("Enter the Author Phone Number:");
		String phone=scn.next();
		
		Author author= new Author();
		author.setAuthorId(id);
		author.setFirstName(firstName);
		author.setMiddleName(middleName);
		author.setLastName(lastName);
		author.setPhoneNo(phone);
		System.out.println(authorService.addAuthor(author));
	}
	static void doUpdate() {
		System.out.println("Enter the Author Id:");
		int id=scn.nextInt();
		System.out.println("Enter the Author update FirstName:");
		String firstName=scn.next();
		System.out.println("Enter the Author update MiddleName:");
		String middleName=scn.next();
		System.out.println("Enter the Author update LastName:");
		String lastName=scn.next();
		System.out.println("Enter the Author update Phone Number:");
		String phone=scn.next();
		
		Author author= new Author();
		author.setAuthorId(id);
		author.setFirstName(firstName);
		author.setMiddleName(middleName);
		author.setLastName(lastName);
		author.setPhoneNo(phone);
		System.out.println(authorService.updateAuthor(author));

		}
	static void doDelete() {
		System.out.println("Enter the Author Id:");
		int id=scn.nextInt();
		
		System.out.println(authorService.deleteAuthor(id));

		
	}
	static void doFetch() {
		System.out.println("Enter the Author Id:");
		int id=scn.nextInt();
		
		System.out.println(authorService.fetch(id));
	}
}
