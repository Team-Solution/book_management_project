package IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Account;
import Model.CreateAccountRequest;
import Repository.AccountREPO;
import Service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
@Autowired
private AccountREPO accountREPO;
	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return accountREPO.findAll();
	}

	@Override
	public List<Account> findById() {
		// TODO Auto-generated method stub
		return accountREPO.findByAccount_id(null);
	}

	@Override
	public Account creatAccount(CreateAccountRequest request) {
		// TODO Auto-generated method stub
		return accountREPO.save(creatAccount(request));
	}

	@Override
	public Account updateAccount(Integer id, CreateAccountRequest request) {
		// TODO Auto-generated method stub
		return accountREPO.save(creatAccount(request));
	}

	@Override
	public List<Account> findByResetToken() {
		// TODO Auto-generated method stub
		return accountREPO.findByReset_Token(null);
	}
	

}
