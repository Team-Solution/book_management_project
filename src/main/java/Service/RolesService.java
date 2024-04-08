package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Roles;
import Model.CreateRoleRequest;

@Service
public interface RolesService {
List<Roles> findAll();
List<Roles> findById();
Roles creatRole(CreateRoleRequest request);
Roles updateRole(Integer id, CreateRoleRequest request);
void deleteRole(Integer id);

}
