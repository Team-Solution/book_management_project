package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PaymentREPO extends JpaRepository<PaymentREPO, Integer> {

}
