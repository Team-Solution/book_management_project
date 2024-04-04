package IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Product;
import Model.CreateProductRequest;
import Repository.CategoryREPO;
import Repository.ProductREPO;
import Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

@Autowired
private ProductREPO productREPO;
@Autowired
private CategoryREPO categoryREPO;
@Override
public List<Product> getList() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Product> getlistNewst(int number) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Product> getListByPrice() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Product> findRelatedProduct(int id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Product> getListProductByCategory(int id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Product> getListByPriceRange(int id, int min, int max) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Product> searchProduct(String keyword) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Product getProduct(int id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Product createProduct(CreateProductRequest request) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Product updateProduct(int id, CreateProductRequest request) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void deleteProduct(int id) {
	// TODO Auto-generated method stub
	
}


}
