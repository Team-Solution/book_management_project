package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Order_status;
import Model.CreateOrder_StatusRequest;
@Service
public interface Order_StatusService {
List<Order_status>findByStatusId(Integer id);
List<Order_status>findAllstatus();
Order_status updateOrder_status(Integer id, CreateOrder_StatusRequest request);
void deleteStatus(Integer id);
}
