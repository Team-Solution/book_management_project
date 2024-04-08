package Service;

import java.util.List;  

import org.springframework.stereotype.Service;

import Entity.Cart;
import Model.CreateCartRequest;

@Service
public interface CartService {
List<Cart>findAll();
List<Cart>fondCartsId(Integer id);
Cart createCart(CreateCartRequest requeste);
Cart updateCart(Integer id, CreateCartRequest request);
void enableCart(Integer id);

void deleteCart(Integer id);
}	  

