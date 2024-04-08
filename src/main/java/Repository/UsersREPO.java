package Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Users;
@Repository
public interface UsersREPO extends JpaRepository<Users, Integer>{
	List<Users> findAllUser();
	List<Users> findListById();
	@SuppressWarnings("unchecked")
	Users save(Users user);
}
