package IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Order_status;
import Model.CreateOrder_StatusRequest;
import Repository.Order_statusREPO;
import Service.Order_StatusService;
@Service
public class Order_statusServiceImpl implements Order_StatusService{
@Autowired
private Order_statusREPO order_statusREPO;
	@Override
	public List<Order_status> findByStatusId(Integer id) {
		// TODO Auto-generated method stub
		return order_statusREPO.findByStatusId(id);
	}

	@Override
	public List<Order_status> findAllstatus() {
		// TODO Auto-generated method stub
		return order_statusREPO.findAllstatus();
	}

	@Override
	public Order_status updateOrder_status(Integer id, CreateOrder_StatusRequest request) {
		// TODO Auto-generated method stub
		return order_statusREPO.save(updateOrder_status(id, request));
	}

	@Override
	public void deleteStatus(Integer id) {
		// TODO Auto-generated method stub
		order_statusREPO.deleteById(id);
	}

}
