package IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Payment;
import Model.CreatePaymentRequest;
import Repository.PaymentREPO;
import Service.PaymentService;
@Service
public class PaymentServiceImpl implements PaymentService{
@Autowired
private PaymentREPO paymentREPO;
	@Override
	public List<Payment> findAllPayments() {
		// TODO Auto-generated method stub
		return paymentREPO.findAllPayments();
	}

	@Override
	public List<Payment> findPaymentsById(Integer id) {
		// TODO Auto-generated method stub
		return paymentREPO.findPaymentsById(id);
	}

	@Override
	public Payment updatePayments(Integer id, CreatePaymentRequest request) {
		// TODO Auto-generated method stub
		return paymentREPO.save(updatePayments(id, request));
	}

	@Override
	public void deletePayments(Integer id) {
		// TODO Auto-generated method stub
		paymentREPO.deleteById(id);
	
	}

}
