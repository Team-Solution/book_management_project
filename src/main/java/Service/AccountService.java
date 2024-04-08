package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Account;
import Model.CreateAccountRequest;

@Service
public interface AccountService {

	List<Account> findAll();
	List<Account> findById();
	List<Account> findByResetToken();
	Account creatAccount(CreateAccountRequest request);
	Account updateAccount(Integer id, CreateAccountRequest request);
}
