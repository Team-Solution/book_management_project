package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Payment;
import Model.CreatePaymentRequest;

@Service
public interface PaymentService {
List<Payment>findAllPayments();
List<Payment>findPaymentsById(Integer id);
Payment updatePayments(Integer id, CreatePaymentRequest request);
void deletePayments(Integer id );
}
