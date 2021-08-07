package com.server.servieImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.server.entity.Account;
import com.server.repository.AccountRepository;
import com.server.service.AccountServiceInterface;

public class AccountServiceImpl implements AccountServiceInterface {

	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public Account addAccount(Account account) {

		Account account1=accountRepository.save(account);
		return account1;
	}

	@Override
	public List<Account> getAll() {
		List<Account> accountsList=new ArrayList<Account>();
		
		accountRepository.findAll().forEach(account->accountsList.add(account));
		
		return accountsList;
	}

	@Override
	public Account updateAccount(Account account) {
		Account account2=accountRepository.save(account);
		return account2;
	}

	@Override
	public Boolean deleteAccount(int id) {
		Account account=accountRepository.findById(id).get();
		if(account!=null) {
			accountRepository.deleteById(id);
			return true;
		}
		else {
			return false;
		}
	}

}
