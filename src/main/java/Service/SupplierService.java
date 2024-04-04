package Service;

import java.util.List;

import Entity.Supplier;
import Model.CreateSupplierRequest;

public interface SupplierService {
	List<Supplier> Findall();
	List<Supplier> findById();
	Supplier createSupplier(CreateSupplierRequest request) ;
	Supplier updateSupplier(Integer id, CreateSupplierRequest request);
	
	void enableSupplier(Integer id);
	void deleteSupplier(Integer id);
}
