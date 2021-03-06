package com.carewassoc;

import java.util.ArrayList;

public class Book {
	private String id;
	private String title;
	private String author;
	private double price;
	private static ArrayList<String> ids = new ArrayList<>();

	private boolean isDuplicated(String id) {
		return (ids.contains(id));
	}

	public Book(String id, String title, String author, double price) {

		if (isDuplicated(id)) {
			System.out.println("This item is duplicated" + id + ": " + title + ": " + author + ": " + price);
			return;
		} else {
			this.id = id;
			this.title = title;
			this.author = author;
			this.price = price;
			ids.add(id);
		}
	}

	public Book(String id, String title, String author) {
		this(id, title, author, 5.00);
	}

	public String toString() {
		return ("Book ID: " + id + ", " + "Book Title: " + title + ", " + "Book Author: " + author + ", "
				+ "Book Price: " + price);

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
