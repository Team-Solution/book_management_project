package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Product;
import Model.CreateProductRequest;
@Service
public interface ProductService {

	List<Product> getList();
	List<Product> getlistNewst(int number);
	List<Product> getListByPrice();
	List<Product> findRelatedProduct(int id);
	List<Product> getListProductByCategory(int id);
	List<Product> getListByPriceRange(int id, int min, int max);
	List<Product> searchProduct(String keyword);
	Product getProduct(int id);
	Product createProduct(CreateProductRequest request);
	Product updateProduct(int id, CreateProductRequest request);
	void deleteProduct(int id);
}
