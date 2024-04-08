package Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Entity.Cart_Item;
@Repository
public interface Cart_ItemREPO extends JpaRepository<Cart_ItemREPO, Integer>{
@Query("Select ci from Cart_Item ci where ci.Item_Id=Item_Id")
List<Cart_Item> findItemsId(Integer Id);

@Query("SELECT ci FROM Cart_Item ci WHERE ci.cart.id = :CartId")
List<Cart_Item>findCartById(Integer Id);

@Query("Select ci from Cart_Item ci where ci.Product_Id=Product_Id")
List<Cart_Item>findProductById(Integer Id);

List<Cart_Item> findAllItem();

Cart_Item save(Cart_Item cartItem);
}
