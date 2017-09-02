package com.carewassoc;

public class LoanableBook extends Book {

	public LoanableBook(String id, String title, String author, double price) {
		super(id, title, author, price);
		// TODO Auto-generated constructor stub
	}

	public LoanableBook(String id, String title, String author) {
		super(id, title, author);
		// TODO Auto-generated constructor stub
	}
	public boolean isLoanable() {
		return true;
	}

}
