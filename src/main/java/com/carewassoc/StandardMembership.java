package com.carewassoc;

public class StandardMembership extends Membership {
	private static StandardMembership standardmembership = null; // new StudentMembership();

	private StandardMembership() {
	} // private to make immutable

	public static Membership getMembership() {
		if (standardmembership == null) {
			standardmembership = new StandardMembership();
		}
		return standardmembership;
	}
	public String toString() {
		return "Standard";
	}

}