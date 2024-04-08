package IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Cart;
import Model.CreateCartRequest;
import Repository.CartREPO;
import Service.CartService;
@Service
public class CartServiceImpl implements CartService {
@Autowired
private CartREPO cartREPO;
	@Override
	public List<Cart> findAll() {
		// TODO Auto-generated method stub
		return cartREPO.findALL();
	}

	@Override
	public Cart createCart(CreateCartRequest requeste) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		cart.setCart_id(requeste.getCart_id());
		cart.setCreate_date(requeste.getCreate_date());
		
		return cartREPO.save(cart);
	}

	@Override
	public Cart updateCart(Integer id, CreateCartRequest request) {
		// TODO Auto-generated method stub
		return cartREPO.save(createCart(request));
	}

	@Override
	public void enableCart(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCart(Integer id) {
		// TODO Auto-generated method stub
		cartREPO.deleteById(id);
	}

	@Override
	public List<Cart> findCartsId(Integer id) {
		// TODO Auto-generated method stub
		return cartREPO.findByCartId(id);
	}

}
