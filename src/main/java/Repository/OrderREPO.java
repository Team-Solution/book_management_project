package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderREPO extends JpaRepository<OrderREPO, Integer>{

}
