package com.carewassoc;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void firstNametest() {
		Person person1 = new Person ("Julie", "Carew");
		assertEquals(person1.getFirstName(),"Julie");
	}
	
	@Test
	public void lastNametest() {
		Person person2 = new Person ("Julie", "Carew");
		assertEquals(person2.getLastName(),"Carew");
	}
}
