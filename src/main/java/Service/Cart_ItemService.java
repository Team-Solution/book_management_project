package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Cart_Item;
import Model.CreateCart_ItemRequest;

@Service
public interface Cart_ItemService {
List<Cart_Item>findItemsId();
List<Cart_Item>findCartId();
List<Cart_Item>findProductId();
List<Cart_Item>findAll();
Cart_Item createCart_Item(CreateCart_ItemRequest request);
Cart_Item updateCart_Item(Integer Id, CreateCart_ItemRequest request);
void deleteById(Integer id);
}
