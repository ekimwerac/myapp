package com.carewassoc;

public class MembershipFactory {
	public static Membership getMembership(String membership) {
		Membership m = null;
		if ("Standard".equals(membership))
			m = StandardMembership.getMembership();
		else if ("Student".equals(membership))
			m = StudentMembership.getMembership();
		else if ("OAP".equals(membership))
			m = OAPMembership.getMembership();

		return m;
	}
}