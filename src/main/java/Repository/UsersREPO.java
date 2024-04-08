package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsersREPO extends JpaRepository<UsersREPO, Integer>{

}
