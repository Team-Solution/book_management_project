package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Supplier;
@Repository
public interface SupplierREPO extends JpaRepository<Supplier, Integer>{
	List<Supplier> findall();
	List<Supplier> findById();
	@SuppressWarnings("unchecked")
	Supplier save(Supplier supplier);
	
}
