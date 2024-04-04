package Service;

import java.util.List;

import Entity.Users;
import Model.CreateUserRequest;

public interface UsersService {
List<Users> findAll();
List<Users> findListById();
Users createUser(CreateUserRequest request);
Users updateUser(Integer id, CreateUserRequest request);
 void enableUser(Integer id);
 void deleteUser (Integer id);
}
