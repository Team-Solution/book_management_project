package Repository;

import java.util.List;

import org.hibernate.boot.jaxb.hbm.spi.JaxbHbmNativeQueryJoinReturnType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Entity.Product;

@Repository
public interface ProductREPO extends JpaRepository<ProductREPO, Integer> {

	@Query(value="Select*from Product order by id decs limit :number ")
	List<Product> getListNewest(int number);
	
	@Query(value = "select*from Product order by price limit 8", nativeQuery = true)
	List<Product> getListByPrice();
	
	@Query(value = "select*from Product where categories_Id = :Id order by rand() limit 4", nativeQuery = true)
	List<Product> findRelatedProduct(Integer id);
	
	@Query(value = "Select*from Product where Categories_Id = :id", nativeQuery = true)
	List<Product> getListProducyByCategory(Integer Id);
	
	@Query(value = "Select*form Product where categories_Id = :id and price between :min and :max", nativeQuery = true)
	List<Product> getListProductByPricerange(Integer id, JaxbHbmNativeQueryJoinReturnType min, int max);
	
	@Query(value = "select p form Product p where p.name like %:keyword% orde  by id desc ")
	List<Product> searchProduct(String keyword );
}
