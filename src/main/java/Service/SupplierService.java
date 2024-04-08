package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Supplier;
import Model.CreateSupplierRequest;
@Service
public interface SupplierService {
	List<Supplier> findall();
	List<Supplier> findById();
	Supplier createSupplier(CreateSupplierRequest request) ;
	Supplier updateSupplier(Integer id, CreateSupplierRequest request);
	
	void enableSupplier(Integer id);
	void deleteSupplier(Integer id);
}
