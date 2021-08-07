package com.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	private int account_id;
	@Column
	private String name;
	@Column
	private double balance;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int account_id, String name, double balance) {
		super();
		this.account_id = account_id;
		this.name = name;
		this.balance = balance;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
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
	
	
}
