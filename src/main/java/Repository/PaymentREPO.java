package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Payment;
@Repository
public interface PaymentREPO extends JpaRepository<PaymentREPO, Integer> {
	List<Payment>findAllPayments();
	List<Payment>findPaymentsById(Integer id);
	Payment save(Payment updatePayments);
}
