package IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Order;
import Model.CreateOrderRequest;
import Repository.OrderREPO;
import Service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{
@Autowired
OrderREPO orderREPO;
	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return orderREPO.findALL();
	}

	@Override
	public List<Order> findOrderById(Integer id) {
		// TODO Auto-generated method stub
		return orderREPO.findOrderById(id);
	}

	@Override
	public Order updateOrder(Integer id, CreateOrderRequest request) {
		// TODO Auto-generated method stub
		return orderREPO.save(updateOrder(id, request));
	}

	@Override
	public void deleteOrder(Integer id) {
		// TODO Auto-generated method stub
		orderREPO.deleteById(id);
	}

}
