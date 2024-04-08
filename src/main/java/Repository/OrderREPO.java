package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Order;
import Model.CreateOrderRequest;
@Repository
public interface OrderREPO extends JpaRepository<OrderREPO, Integer>{
	List<Order>findALL();
	List<Order>findOrderById(Integer id);
	Order updateOrder(Integer id, CreateOrderRequest request);
	void deleteOrder(Integer id);
	Order save(Order updateOrder);
}
