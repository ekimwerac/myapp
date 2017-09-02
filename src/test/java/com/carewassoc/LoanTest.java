package com.carewassoc;

import java.util.Date;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class LoanTest {

	@Test
	public void loanTest() {
		@SuppressWarnings("deprecation")
		Date loandate1 = new Date(2017,9,01);
		Person loanPerson1 = new Person("Mike", "Carew");
		Book loanbook1=new Book("T1", "My Book", "My Title", 20.00);
		Loan loan1 = new Loan(loandate1, loanPerson1, loanbook1 );
		
		
		assertEquals("loan1 Person", loan1.getLoanperson().getFirstName(), "Mike");
		
		
	}

}
