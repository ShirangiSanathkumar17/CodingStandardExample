package com.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.server.entity.Account;
import com.server.servieImpl.AccountServiceImpl;



@RestController
public class AccountController {
	@Autowired 
	AccountServiceImpl accountServiceImpl;

	@PostMapping(value="/addAccount")
	public ResponseEntity<Account> addAccount(@RequestBody Account account) {
		Account account1=accountServiceImpl.addAccount(account);
		if (account1 != null) {
			return new ResponseEntity<Account>(account1, HttpStatus.CREATED);
		} else {
			return new ResponseEntity("Account is not found!!", HttpStatus.BAD_REQUEST);

		}
	}
	
	@GetMapping(value="/getAll",produces= {"application/json","application/xml"})
	
	public ResponseEntity<List<Account>> getAll(){
		List<Account> accountsList=accountServiceImpl.getAll();
		if ( accountsList!= null) {
			return new ResponseEntity<List<Account>>(accountsList, HttpStatus.OK);
		} else {
			return new ResponseEntity("No record is Found!!", HttpStatus.BAD_REQUEST);

		}
	}
	
	@PutMapping(value="/updateBalance",produces= {"application/json","application/xml"})
	 public ResponseEntity<Account> updateAccount(@RequestBody Account account){
		Account updatedAccount = accountServiceImpl.updateAccount(account);
		if ( updatedAccount!= null) {
			return new ResponseEntity<Account>(updatedAccount, HttpStatus.OK);
		} 
		return null;
	}
	
	@DeleteMapping(value="/deleteAccount/{id}")
	public ResponseEntity<String> deleteAccount(@PathVariable int id){
		Boolean flag=accountServiceImpl.deleteAccount(id);
		if(flag) {
			return new ResponseEntity<String>("Deleted", HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("AccountId Not Found", HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
}
