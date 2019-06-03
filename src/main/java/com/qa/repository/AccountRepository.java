package com.qa.repository;

import java.util.List;

import com.qa.model.Account;

public interface AccountRepository {
	//C
	public Account createAccount(Account account);
	
	//R
	public Account readAccount(int id);
	public List<Account> getAccounts();
	
	//U
	public Account updateName(int id, String newName);
	
	//D
	public void deleteAccount(int id);
	
}
