package com.boot.Tash.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.Tash.domain.OrderDomain;
import java.util.List;

public interface OrderRepository extends JpaRepository<OrderDomain,Integer>{
	
	//getAll orders
	//find by Id
	//delete
	//update
	//custom query

}
