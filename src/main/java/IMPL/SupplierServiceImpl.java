package IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Supplier;
import Model.CreateSupplierRequest;
import Repository.SupplierREPO;
import Service.SupplierService;
@Service
public class SupplierServiceImpl implements SupplierService{
@Autowired
SupplierREPO supplierREPO;
	@Override
	public List<Supplier> findall() {
		// TODO Auto-generated method stub
		return supplierREPO.findall() ;
	}

	@Override
	public List<Supplier> findById() {
		// TODO Auto-generated method stub
		return supplierREPO.findById();
	}

	@Override
	public Supplier createSupplier(CreateSupplierRequest request) {
		// TODO Auto-generated method stub
		 Supplier supplier = new Supplier();
		    supplier.setName(request.getName());
		    supplier.setAddress(request.getAddress());
		    supplier.setEmail(request.getEmail());
		return supplierREPO.save(supplier);
	}

	@Override
	public Supplier updateSupplier(Integer id, CreateSupplierRequest request) {
		// TODO Auto-generated method stub
		return supplierREPO.save(updateSupplier(id, request));
	}

	@Override
	public void enableSupplier(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSupplier(Integer id) {
		// TODO Auto-generated method stub
		supplierREPO.deleteById(id);
	}

}
