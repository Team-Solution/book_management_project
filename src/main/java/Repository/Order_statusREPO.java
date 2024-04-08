package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Order_status;

public interface Order_statusREPO extends JpaRepository<Order_status, Integer>{
	List<Order_status>findByStatusId(Integer id);
	List<Order_status>findAllstatus();
}
