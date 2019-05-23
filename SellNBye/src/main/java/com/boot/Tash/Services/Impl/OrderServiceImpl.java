package com.boot.Tash.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.Tash.Repositories.OrderRepository;
import com.boot.Tash.Services.OrderServices;
import com.boot.Tash.domain.OrderDomain;

@Service
public class OrderServiceImpl implements OrderServices {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<OrderDomain> findAllOrders() {
		
		List<OrderDomain> allproducts = orderRepository.findAll();
		return allproducts;
	}

	@Override
	public String saveOrder(OrderDomain orderdata) {

		orderRepository.save(orderdata);
		return " Data saved";
	}

	@Override
	public String updateOrder(OrderDomain newOrderData) {

		String msg = null;
		if (newOrderData.getOid() != null) {
			orderRepository.save(newOrderData);
			msg = "Successfully Updated!!";
		} else {
			msg = "Error";
		}
		return msg;

	}

	@Override
	public Optional<OrderDomain> findById(Integer id) {

		Optional<OrderDomain> sortOrd = orderRepository.findById(id);
		return sortOrd;
	}

	@Override
	public String deletebyId(Integer id) {
		
		String msg = null;
		if (id != null) {
			orderRepository.deleteById(id);
			msg = "Succesfully Deleted";
		} else {
			msg = "Error in Deleting Products";
		}
		return msg;
	}

}
