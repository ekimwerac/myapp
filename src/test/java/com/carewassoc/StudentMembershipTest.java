package com.carewassoc;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentMembershipTest {

	@Test
	public void stuMembershiptest() {
		StudentMembership sm1=null;
		StudentMembership sm2=null;
		sm1=StudentMembership.getInstance();
		sm2=StudentMembership.getInstance();
		
		assertEquals(true, sm1==sm2);

	}

}
