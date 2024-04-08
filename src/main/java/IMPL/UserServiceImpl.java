package IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Users;
import Model.CreateUserRequest;
import Repository.UsersREPO;
import Service.UsersService;
@Service
public class UserServiceImpl implements UsersService{
@Autowired
private UsersREPO usersREPO;
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return usersREPO.findAllUser();
	}

	@Override
	public List<Users> findListById() {
		// TODO Auto-generated method stub
		return usersREPO.findListById();
	}

	@Override
	public Users createUser(CreateUserRequest request) {
		// TODO Auto-generated method stub
		 Users user = new Users();
		    user.setUsername(request.getUsername());
		    user.setEmail(request.getEmail());
		return usersREPO.save(user);
	}

	@Override
	public Users updateUser(Integer id, CreateUserRequest request) {
		// TODO Auto-generated method stub
		return usersREPO.save(updateUser(id, request));
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		usersREPO.deleteById(id);
	}

	
}
