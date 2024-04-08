package Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Entity.Categories;
@Repository
public interface CategoryREPO extends JpaRepository<Categories, Integer>{
	 @Query("Select c from Categories c where c.enable = true")
	    List<Categories> findALLByEnabled();

	 List<Categories> findById();
}
