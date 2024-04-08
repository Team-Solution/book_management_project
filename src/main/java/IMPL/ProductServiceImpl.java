package IMPL;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Product;
import Model.CreateProductRequest;
import Repository.ProductREPO;
import Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductREPO pRepo;

	@Override
	public List<Product> findNewest(int number) {
		// TODO Auto-generated method stub
		return pRepo.findNewest(number);
	}

	@Override
	public List<Product> findByPrice() {
		// TODO Auto-generated method stub
		return pRepo.findByPrice();
	}

	@Override
	public List<Product> findRelatedProduct(int id) {
		// TODO Auto-generated method stub
		return pRepo.findRelatedProduct(id);
	}

	@Override
	public List<Product> findProductByCategory(int id) {
		// TODO Auto-generated method stub
		return pRepo.findProductByCategory(id);
	}

	@Override
	public List<Product> findByPriceRange(int id, int min, int max) {
		// TODO Auto-generated method stub
		return pRepo.findByPriceRange(id, min, max);
	}

	@Override
	public List<Product> searchProduct(String keyword) {
		// TODO Auto-generated method stub
		return pRepo.searchProduct(keyword);
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return  (Product) pRepo.findByProductId(id);	
		}

	@Override
	public Product createProduct(CreateProductRequest request) {
		// TODO Auto-generated method stub
		Product pd = new Product();
		pd.setName(request.getName());
		pd.setPrice(request.getPrice());
		return pRepo.save(pd);
	}

	@Override
	public Product updateProduct(int id, CreateProductRequest request) {
		// TODO Auto-generated method stub
		Product pdProduct = (Product) pRepo.findByProductId(id);
		if (pdProduct != null) {
			pdProduct.setName(request.getName());
			pdProduct.setPrice(request.getPrice());
			return pRepo.save(pdProduct);
		}
		return null;
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		pRepo.deleteById(id);
		
	}
}
