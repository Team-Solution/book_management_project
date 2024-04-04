	package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Account;

public interface AccountREPO extends JpaRepository<Account,Integer>{

}
