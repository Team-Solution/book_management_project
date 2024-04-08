package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Entity.Product;

@Repository
public interface ProductREPO extends JpaRepository<Product, Integer> {
	@Query(value="Select*from Product order by id decs limit :number ")
	List<Product>  findNewest(int number);
	
	@Query(value = "select*from Product order by price limit 8", nativeQuery = true)
	List<Product> findByPrice();
	
	@Query(value = "select*from Product where categories_Id = :Id order by rand() limit 4", nativeQuery = true)
	List<Product> findRelatedProduct(Integer id);
	
	@Query(value = "Select*from Product where Categories_Id = :id", nativeQuery = true)
	List<Product> findProductByCategory(Integer Id);
	
	@Query(value = "Select*form Product where categories_Id = :id and price between :min and :max", nativeQuery = true)
	List<Product> findByPriceRange(Integer id, int min, int max);
	
	@Query(value = "select p form Product p where p.name like %:keyword% orde  by id desc ")
	List<Product> searchProduct(String keyword );
	List<Product> findALL();
	List<Product> findByProductId(int id);
	@SuppressWarnings("unchecked")
	Product save(Product pd);
}

