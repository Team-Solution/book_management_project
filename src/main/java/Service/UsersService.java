package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Users;
import Model.CreateUserRequest;
@Service
public interface UsersService {
List<Users> findAll();
List<Users> findListById();
Users createUser(CreateUserRequest request);
Users updateUser(Integer id, CreateUserRequest request);
 void deleteUser (Integer id);
}
