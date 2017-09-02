package com.carewassoc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookTest {


	@Test
	public void testTitle() {
		Book book1 = new Book("T1", "My Book", "Mike Carew", 20.00);
		
		assertEquals("Title not set correctly", book1.getTitle(), "My Book");
	}
	
	@Test
	public void testAuthor() {
		Book book1 = new Book("T2", "My Book", "Mike Carew", 20.00);
		Book book2 = new Book("T2", "My Book", "Mike Carew", 20.00);
		assertEquals("Author not set correctly", book2.getAuthor(), "Mike Carew");		
		assertEquals("Author not set correctly", book1.getAuthor(), "Mike Carew");
	}
	@Test
	public void testID() {
		Book book1 = new Book("T3", "My Book", "Mike Carew", 20.00);
		assertEquals("ID not set correctly", book1.getId(), "T3");
	}
	@Test
	public void testPrice() {
		Book book1 = new Book("T4", "My Book", "Mike Carew", 20.00);
		assertEquals(book1.getPrice(), 20.00, 0);
	}
}
