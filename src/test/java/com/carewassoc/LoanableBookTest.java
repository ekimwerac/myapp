package com.carewassoc;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoanableBookTest {

	@Test
	public void loanabtest() {
		LoanableBook lb1 = new LoanableBook("T1","Mike carew","My Book");
		assertTrue(lb1.isLoanable());
	}

}
