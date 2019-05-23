package com.boot.Tash.Controllers;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.Tash.Services.OrderServices;
import com.boot.Tash.Services.Impl.OrderServiceImpl;
import com.boot.Tash.domain.OrderDomain;

@RestController
@RequestMapping("/order")
public class Order {
	@Autowired
	private OrderServices orderservices;

	@GetMapping("/all")
	public List<OrderDomain> allOrders() {
		return orderservices.findAllOrders();

	}

	@PostMapping("/add")
	public String addOrder(@RequestBody OrderDomain Orderdata) {
		return orderservices.saveOrder(Orderdata);
	}

	@PutMapping("/update")
	public String updateOrder(@RequestBody OrderDomain newOrderData) {
		return orderservices.updateOrder(newOrderData);
	}

	@GetMapping("/find/{id}")
	public Optional<OrderDomain> getOrderById(@PathVariable Integer id) {
		return orderservices.findById(id);

	}

	@DeleteMapping("/delete/{id}")
	public String deleteOrderById(@PathVariable Integer id) {
		return orderservices.deletebyId(id);
	}

}
