package com.boot.Mihi.Services;

import java.util.List;
import java.util.Optional;

import com.boot.Mihi.domain.ProductDomain;


public interface ProductServices {

	List<ProductDomain> findAllProducts();

	String saveProduct(ProductDomain productdata);

	String updateProduct(ProductDomain newProductData);

	Optional<ProductDomain> findById(Integer id);

	String deletebyId(Integer id);

	

}
