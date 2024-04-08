package IMPL;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import Entity.OrderDetail;
import Model.CreateOrderDeatilRequest;
import Repository.OrderDeatailREPO;
@Service
public class OrderDetailSeviceImpl implements OrderDeatailREPO{
@Autowired
private OrderDeatailREPO orderDeatailREPO;

@Override
public List<OrderDetail> findAllOrderDetails(){
	return orderDeatailREPO.findAllOrderDetails();
}

@Override
public List<OrderDetail> findOrderDetailsById(Integer id){
	return orderDeatailREPO.findOrderDetailsById(id);
}

@Override
public OrderDetail updateOrderDetailin(CreateOrderDeatilRequest request) {
	return orderDeatailREPO.save(updateOrderDetailin(request));
	
}
@Override
public void deleteOrderDetail(Integer id) {
	orderDeatailREPO.deleteById(id);
}

@Override
public List<OrderDeatailREPO> findAll() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<OrderDeatailREPO> findAll(Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<OrderDeatailREPO> findAllById(Iterable<Integer> ids) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends OrderDeatailREPO> List<S> saveAll(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void flush() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends OrderDeatailREPO> S saveAndFlush(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends OrderDeatailREPO> List<S> saveAllAndFlush(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteAllInBatch(Iterable<OrderDeatailREPO> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAllByIdInBatch(Iterable<Integer> ids) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAllInBatch() {
	// TODO Auto-generated method stub
	
}

@Override
public OrderDeatailREPO getOne(Integer id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public OrderDeatailREPO getById(Integer id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public OrderDeatailREPO getReferenceById(Integer id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends OrderDeatailREPO> List<S> findAll(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends OrderDeatailREPO> List<S> findAll(Example<S> example, Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Page<OrderDeatailREPO> findAll(Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends OrderDeatailREPO> S save(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Optional<OrderDeatailREPO> findById(Integer id) {
	// TODO Auto-generated method stub
	return Optional.empty();
}

@Override
public boolean existsById(Integer id) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public long count() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void deleteById(Integer id) {
	// TODO Auto-generated method stub
	
}

@Override
public void delete(OrderDeatailREPO entity) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAllById(Iterable<? extends Integer> ids) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll(Iterable<? extends OrderDeatailREPO> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends OrderDeatailREPO> Optional<S> findOne(Example<S> example) {
	// TODO Auto-generated method stub
	return Optional.empty();
}

@Override
public <S extends OrderDeatailREPO> Page<S> findAll(Example<S> example, Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends OrderDeatailREPO> long count(Example<S> example) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public <S extends OrderDeatailREPO> boolean exists(Example<S> example) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public <S extends OrderDeatailREPO, R> R findBy(Example<S> example,
		Function<FetchableFluentQuery<S>, R> queryFunction) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public OrderDetail save(OrderDetail updateOrderDetailin) {
	// TODO Auto-generated method stub
	return null;
}
}
