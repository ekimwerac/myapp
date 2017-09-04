package com.carewassoc;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void firstNametest() {
		Person person1 = new Person ("Julie", "Carew", "Standard");
		assertEquals(person1.getFirstName(),"Julie");
		assertEquals(person1.getMembership().toString(),"Standard");
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
