package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Entity.OrderDetail;
import Model.CreateOrderDeatilRequest;
@Service
public interface OrderDetailService {
List<OrderDetail>findAllOrderDetails();
List<OrderDetail>findOrderDetailsById(Integer id);
OrderDetail updateOrderDetail(Integer id, CreateOrderDeatilRequest request);
void deleteOrderDetail(Integer id);
}
