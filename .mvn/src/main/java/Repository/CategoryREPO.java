package Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Entity.Categories;

public interface CategoryREPO extends JpaRepository<Categories, Integer>{
	 @Query("Select c from Categories c where c.enable = true")
	    List<Categories> findALLByEnabled();

	Optional<Categories> findById();
}
