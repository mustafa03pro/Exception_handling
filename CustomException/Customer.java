package com.mustafa.july15CustomException;

public class Customer {
	private String name;
	private BankAccount account;
	public Customer(String name, BankAccount account) {
		super();
		this.name = name;
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public BankAccount getAccount() {
		return account;
	}
	

}
