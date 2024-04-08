package IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.OrderDetail;
import Model.CreateOrderDeatilRequest;
import Repository.OrderDeatailREPO;
import Service.OrderDetailService;
@Service
public class OrderDetailSeviceImpl implements OrderDetailService{
@Autowired
private OrderDeatailREPO orderDeatailREPO;

@Override
public List<OrderDetail> findAllOrderDetails() {
	// TODO Auto-generated method stub
	return orderDeatailREPO.findAllOrderDetails();
}

@Override
public List<OrderDetail> findOrderDetailsById(Integer id) {
	// TODO Auto-generated method stub
	return orderDeatailREPO.findOrderDetailsById(id);
}

@Override
public OrderDetail updateOrderDetail(Integer id, CreateOrderDeatilRequest request) {
	// TODO Auto-generated method stub
	return orderDeatailREPO.save(updateOrderDetail(id, request));
}

@Override
public void deleteOrderDetail(Integer id) {
	// TODO Auto-generated method stub
	orderDeatailREPO.deleteById(id);
}


}
