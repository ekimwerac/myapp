package com.carewassoc;

public class ReferenceBook extends Book {

	public ReferenceBook(String id, String title, String author, double price) {
		super(id, title, author, price);
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(String id, String title, String author) {
		super(id, title, author);
		// TODO Auto-generated constructor stub
	}
	public boolean isLoanable() {
		return false;
	}
	@Override
	public String toString() {
		return ("Book ID: " + id + ", " + "Book Title: " + title + ", " + "Book Author: " + author + ", "
				+ "Book Price: " + price + "Reference");

	}

}
