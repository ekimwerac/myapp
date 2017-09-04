package com.carewassoc;

public class StudentMembership extends Membership {
	private static StudentMembership studentmembership=null;

	private StudentMembership() {
	} // private for immutability


	public static Membership getMembership() {
		if (studentmembership == null) {
			studentmembership = new StudentMembership();
		}
		return studentmembership;
	}
	public String toString() {
		return "Student";
	}

}
