package com.boot.Mihi.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.Mihi.Services.ProductServices;
import com.boot.Mihi.domain.ProductDomain;

@RestController
@RequestMapping("/product")
public class Product {

	@Autowired
	private ProductServices productservices;

	@GetMapping("/all")
	public List<ProductDomain> allOrders() {
		return productservices.findAllProducts();

	}

	@PostMapping("/add")
	public String addProduct(@RequestBody ProductDomain Productdata) {
		return productservices.saveProduct(Productdata);
	}

	@PutMapping("/update")
	public String updateProduct(@RequestBody ProductDomain newProductData) {
		return productservices.updateProduct(newProductData);
	}

	@GetMapping("/find/{id}")
	public Optional<ProductDomain> getProductById(@PathVariable Integer id) {
		return productservices.findById(id);

	}

	@DeleteMapping("/delete/{id}")
	public String deleteProductById(@PathVariable Integer id) {
		return productservices.deletebyId(id);
	}

}
