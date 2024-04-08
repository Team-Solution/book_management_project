package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Order;
import Model.CreateOrderRequest;

@Service
public interface OrderService {
List<Order>findAll();
List<Order>findOrderById(Integer id);
Order updateOrder(Integer id, CreateOrderRequest request);
void deleteOrder(Integer id);
	
}
