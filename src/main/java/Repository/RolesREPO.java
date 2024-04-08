package Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Roles;
@Repository
public interface RolesREPO extends JpaRepository<Roles, Integer> {
	List<Roles> findAllRole();
	List<Roles> findById();
	@SuppressWarnings("unchecked")
	Roles save(Roles role);
}
