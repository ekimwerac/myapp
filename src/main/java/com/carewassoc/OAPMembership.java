package com.carewassoc;

public class OAPMembership extends Membership {
	private static OAPMembership oapmembership = null;

	private OAPMembership() {
	}


	public static Membership getMembership() {
		if (oapmembership == null) {
			oapmembership = new OAPMembership();
		}
		return oapmembership;
	}
}