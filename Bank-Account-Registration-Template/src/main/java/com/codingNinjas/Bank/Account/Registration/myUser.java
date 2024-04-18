package com.codingNinjas.Bank.Account.Registration;

import java.util.ArrayList;
import java.util.List;

public class myUser implements User {
	String name;
	ArrayList<Account> accountList = new ArrayList<Account>();

	public void init() {
		System.out.println("user created");
	}

	public void destroy() {
		System.out.println("user bean has destroyed");
	}

	@Override
	public void setUserDetails(String name) {
		// TODO Auto-generated method stub
		this.name = name;

	}

	@Override
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		this.accountList.add(account);

	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return this.accountList;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
