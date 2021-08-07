package com.server.service;

import java.util.List;

import com.server.entity.Account;

public interface AccountServiceInterface {

	 Account addAccount(Account account);
	
	 List<Account> getAll();
	
	 Account updateAccount(Account account);
	
	 Boolean deleteAccount(int id);
}
