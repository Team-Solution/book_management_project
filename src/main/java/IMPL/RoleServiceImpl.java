package IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Roles;
import Model.CreateRoleRequest;
import Repository.RolesREPO;
import Service.RolesService;
@Service
public class RoleServiceImpl implements RolesService {
@Autowired
private RolesREPO rolesREPO;
	@Override
	public List<Roles> findAll() {
		// TODO Auto-generated method stub
		return rolesREPO.findAllRole();
	}

	@Override
	public List<Roles> findById() {
		// TODO Auto-generated method stub
		return rolesREPO.findById();
	}

	@Override
	public Roles creatRole(CreateRoleRequest request) {
		// TODO Auto-generated method stub
		Roles role = new Roles();
	    role.setName(request.getName());
		return rolesREPO.save(role);
	}

	@Override
	public Roles updateRole(Integer id, CreateRoleRequest request) {
		// TODO Auto-generated method stub
		return rolesREPO.save(updateRole(id, request));
	}

	@Override
	public void deleteRole(Integer id) {
		// TODO Auto-generated method stub
		rolesREPO.deleteById(id);
	}

	
}
