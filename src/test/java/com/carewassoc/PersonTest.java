package com.carewassoc;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void firstNametest() {
		ReferenceBook b1 = new ReferenceBook ("T9", "Java I/O Programming","E.R.Harrold",18.99);
		ReferenceBook b2 = new ReferenceBook ("T8", "Java Programming","E.R.Harrold",18.99);
		ReferenceBook b3 = new ReferenceBook ("T7", "Java Prog","E.R.Harrold",18.99);
		
		Person person1 = new Person ("Julie", "Carew", "Standard");
		assertEquals(person1.getFirstName(),"Julie");
		assertEquals(person1.getMembership().toString(),"Standard");
		person1.borrow(b1);
		person1.borrow(b2);
		person1.borrow(b3);
		person1.listBooks();
	}
	
	@Test
	public void lastNametest() {
		Person person2 = new Person ("Julie", "Carew", "Student");
		assertEquals(person2.getLastName(),"Carew");
		assertEquals(person2.getMembership().toString(),"Student");
	}
	@Test
	public void membershiptest() {
		Person person3 = new Person ("Julie", "Carew", "OAP");
		assertEquals(person3.getMembership().toString(),"OAP");
	}
}
