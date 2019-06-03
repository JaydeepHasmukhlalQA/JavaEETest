package com.qa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.qa.model.Account;

public class AccountRepositoryDB implements AccountRepository{

	@PersistenceContext
	private EntityManager em;
	
	public Account createAccount(Account account) {
		em.persist(account);
		return account;
	}

	public Account readAccount(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Account> getAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Account updateName(int id, String newName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAccount(int id) {
		// TODO Auto-generated method stub
		
	}

}
