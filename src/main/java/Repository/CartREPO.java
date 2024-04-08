package Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Entity.Cart;
@Repository
public interface CartREPO extends JpaRepository<Cart, Integer>{
@Query("Select c from Cart c where c.User_Id = User_Id")
List<Cart>findByUserId(Integer Id);

@Query("Select c from Cart c where c.Cart_Id = Cart_Id")
List<Cart>findByCartId(Integer Id);

List<Cart>findALL();

@SuppressWarnings("unchecked")
Cart save(Cart cart);
}
