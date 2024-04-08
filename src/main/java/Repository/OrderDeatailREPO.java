package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.OrderDetail;
import Model.CreateOrderDeatilRequest;
@Repository
public interface OrderDeatailREPO extends JpaRepository<OrderDeatailREPO, Integer> {
	List<OrderDetail>findAllOrderDetails();
	List<OrderDetail>findOrderDetailsById(Integer id);
	OrderDetail updateOrderDetailin(CreateOrderDeatilRequest request);
	OrderDetail save(OrderDetail updateOrderDetailin);
	void deleteOrderDetail(Integer id);
}
