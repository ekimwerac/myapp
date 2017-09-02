package com.carewassoc;
import java.util.Date;

public class Loan {
	private Date loanDate;
	private Person loanPerson;
	private Book loanBook;
	public Loan(Date loanDate, Person loanPerson, Book loanBook) {
		super();
		this.loanDate = loanDate;
		this.loanPerson = loanPerson;
		this.loanBook = loanBook;
	}
	public Date getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}
	public Person getLoanperson() {
		return loanPerson;
	}
	public void setLoanPerson(Person loanPerson) {
		this.loanPerson = loanPerson;
	}
	public Book getLoanBook() {
		return loanBook;
	}
	public void setLoanBook(Book loanBook) {
		this.loanBook = loanBook;
	}
	@Override
	public String toString() {
		return "Loan [loanDate=" + loanDate + ", loanPerson=" + loanPerson + ", loanBook=" + loanBook + "]";
	}
	
}
