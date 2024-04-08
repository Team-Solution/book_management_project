package IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Cart_Item;
import Model.CreateCart_ItemRequest;
import Repository.Cart_ItemREPO;
import Service.Cart_ItemService;
@Service
public class Cart_ItemServiceImpl implements Cart_ItemService {
@Autowired
private Cart_ItemREPO cart_ItemREPO;
	@Override
	public List<Cart_Item> findItemsId() {
		// TODO Auto-generated method stub
		return cart_ItemREPO.findItemsId(null);
	}

	@Override
	public List<Cart_Item> findCartId() {
		// TODO Auto-generated method stub
		return cart_ItemREPO.findCartById(null);
	}

	@Override
	public List<Cart_Item> findProductId() {
		// TODO Auto-generated method stub
		return cart_ItemREPO.findProductById(null);
	}

	@Override
	public List<Cart_Item> findAll() {
		// TODO Auto-generated method stub
		return cart_ItemREPO.findAllItem();
	}

	@Override
	public Cart_Item createCart_Item(CreateCart_ItemRequest request) {
		// TODO Auto-generated method stub
		Cart_Item cartItem = new Cart_Item();
        cartItem.setItem_id(request.getItem_id());
        cartItem.setQuantity(request.getQuantity());
		return cart_ItemREPO.save(cartItem);
	}

	@Override
	public Cart_Item updateCart_Item(Integer Id, CreateCart_ItemRequest request) {
		// TODO Auto-generated method stub
		return cart_ItemREPO.save(createCart_Item(request));
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		cart_ItemREPO.deleteById(id);
		
	}

}
