package Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Entity.Account;


@Repository
public interface AccountREPO extends JpaRepository<Account,Integer>{
 @Query("Select a from Accounts a Where a.username=?1")
 List<Account> findByAccount_id(Integer account_id);
 
 @Query("Select a from Accounts a Where a.email=?1")
 List<Account> findByEmail(String email);
 
 @Query("Select a form Accounts a Where a.Reset_token=?1")
 List<Account> findByReset_Token(String reset_Token);
 
}
