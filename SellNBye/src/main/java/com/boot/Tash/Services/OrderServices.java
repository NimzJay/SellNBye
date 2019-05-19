package com.boot.Tash.Services;

import java.util.List;
import java.util.Optional;

import com.boot.Tash.domain.OrderDomain;



public interface OrderServices {
	
	List<OrderDomain> findAllOrders();

	String saveOrder(OrderDomain orderdata);

	String updateOrder(OrderDomain newOrderData);

	String deletebyId(Integer id);

	Optional<OrderDomain> findById(Integer id);

	

	

	

	

}
