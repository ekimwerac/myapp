package com.carewassoc;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String firstName;
	private String lastName;
	private Membership membership;
	private List<Book> books =new ArrayList<Book>();
	
	public Person(String firstName, String lastName, String membertype) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.membership=MembershipFactory.getMembership(membertype);
	}

	public void listBooks() {
		Book tbook;
		int i;
		int size =books.size();
		for (i=0; i<size; i++) {
			tbook=books.get(i);
			System.out.println(tbook);
		}
	}
	public void borrow(Book book) {
		books.add(book);
		
	}
	public String getFirstName() {
		return firstName;
		
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMembership(String membership) {
		this.membership = MembershipFactory.getMembership(membership);
	}
	public Membership getMembership() {
		return this.membership;
	}
	
	

	@Override
	public String toString(){
		return ("Person:\nFirst name:" + firstName + " \n" + "Last name: " + lastName + "MemberType: " + membership);
	}

}
