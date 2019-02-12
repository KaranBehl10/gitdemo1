package com.ABC_Bank_App.dao;

import org.springframework.data.repository.CrudRepository;

import com.ABC_Bank_App.model.Accounts;

public interface AccountsDao extends CrudRepository<Accounts, Integer>{
	
}
