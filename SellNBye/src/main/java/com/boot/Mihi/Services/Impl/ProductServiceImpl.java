package com.boot.Mihi.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.Mihi.Repositories.ProductRepository;
import com.boot.Mihi.Services.ProductServices;
import com.boot.Mihi.domain.ProductDomain;
import com.boot.Nimz.Model.UserDTO;

@Service
public class ProductServiceImpl implements ProductServices {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<ProductDomain> findAllProducts() {
		// TODO Auto-generated method stub
		// Search from database
		// Return all Products
		List<ProductDomain> allproducts = productRepository.findAll();
		return allproducts;
	}

	@Override
	public String saveProduct(ProductDomain Productdata) {
		// TODO Auto-generated method stub

		productRepository.save(Productdata);
		return " Data saved";
	}

	@Override
	public String updateProduct(ProductDomain newProductData) {

		String msg = null;
		
		if (newProductData.getPid() != null) {
			productRepository.save(newProductData);
			msg = "Successfully Updated!!";
		} else {
			msg = "Error";
		}
		return msg;

	}

	/*@Override
	public ProductDomain findById(Integer id) {
		
		ProductDomain sortPro = productRepository.findOne(id); 		
		return sortPro; 
	}*/
	
	@Override
	public Optional<ProductDomain> findById(Integer id) {
		
		Optional<ProductDomain> sortPro = productRepository.findById(id); 		
		return sortPro; 
	}

	@Override
	public String deletebyId(Integer id) {
		String msg = null;
		if(id != null) {
			productRepository.deleteById(id);
			msg = "Succesfully Deleted";
		}else {
			msg = "Error in Deleting Products";
		}
		return msg;
	}

}