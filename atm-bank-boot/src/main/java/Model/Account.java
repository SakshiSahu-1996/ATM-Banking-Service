package Model;

import Enums.AccountType;

public class Account {

	private long number;
	private String name;
	private double balance;
	private int password;
	private AccountType accountType;

	public Account(long number, String name, double balance, int password) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.password = password;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
}
