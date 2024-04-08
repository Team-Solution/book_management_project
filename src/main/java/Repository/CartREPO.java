package Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Entity.Cart;
@Repository
public interface CartREPO extends JpaRepository<CartREPO, Integer>{
@Query("Select c from Cart c where c.User_Id = User_Id")
Optional<Cart>findByUserId(Integer Id);

@Query("Select c from Cart c where c.Cart_Id = Cart_Id")
Optional<Cart>findByCartId(Integer Id);

}
