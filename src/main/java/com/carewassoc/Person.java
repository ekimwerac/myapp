package com.carewassoc;

public class Person {
	private String firstName;
	private String lastName;
	private Membership membership;
	
	public Person(String firstName, String lastName, String membertype) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.membership=MembershipFactory.getMembership(membertype);
	}

	public void borrow(Book) {
		
	}
	public String getFirstName() {
		return firstName;
		
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMembership(String membership) {
		this.membership = MembershipFactory.getMembership(membership);
	}
	public Membership getMembership() {
		return this.membership;
	}
	
	

	@Override
	public String toString(){
		return ("Person:\nFirst name:" + firstName + " \n" + "Last name: " + lastName + "MemberType: " + membership);
	}

}
