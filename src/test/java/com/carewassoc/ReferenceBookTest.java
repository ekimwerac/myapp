package com.carewassoc;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReferenceBookTest {

	@Test
	public void ReferenceBooktest() {
		ReferenceBook rb1 = new ReferenceBook("T1", "Mike Carew", "My Scary Book");
		assertFalse(rb1.isLoanable());
	}
		
}
