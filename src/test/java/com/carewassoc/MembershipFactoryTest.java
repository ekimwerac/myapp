package com.carewassoc;

import org.junit.Test;

public class MembershipFactoryTest {

	@Test
	public void Main() {
		StandardMembership stam = (StandardMembership) MembershipFactory.getMembership("Standard");
		StandardMembership stam2 = (StandardMembership) MembershipFactory.getMembership("Standard");
		System.out.println("Standard Member 1: " + stam.toString());
		System.out.println("Standard Member 2: " + stam2.toString());

		// assertEquals(true, stam.toString() == stam2.toString());

		StudentMembership stum = (StudentMembership) MembershipFactory.getMembership("Student");
		StudentMembership stum2 = (StudentMembership) MembershipFactory.getMembership("Student");
		System.out.println("Student Member 1: " + stum.toString());
		System.out.println("Student Member 2: " + stum2.toString());

		// assertEquals(true, stum.toString() == stum2.toString());
		OAPMembership oapm = (OAPMembership) MembershipFactory.getMembership("OAP");
		OAPMembership oapm2 = (OAPMembership) MembershipFactory.getMembership("OAP");
		System.out.println("OAP Member 1: " + oapm.toString());
		System.out.println("OAP Member 2: " + oapm2.toString());
	}
}
