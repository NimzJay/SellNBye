package com.boot.Biffer.Controllers;

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

import com.boot.Biffer.Model.CategoryDTO;
import com.boot.Biffer.Services.CategoryServices;

@RestController
@RequestMapping ("/Category")

public class Category {
	
	@Autowired
	private CategoryServices categoryservices;
	
	@GetMapping("/all")
	public List<CategoryDTO> allCategory(){
		return categoryservices.findAllCategory();
	}
	
	@PostMapping("/add")
	public String addCategory(@RequestBody CategoryDTO CategoryData) {
		return categoryservices.saveCategory(CategoryData);
	}
	
	@PutMapping("/update")
	public String updateCategogory(@RequestBody CategoryDTO newCategoryData) {
		return categoryservices.updateCategory(newCategoryData);
	}
	
	@GetMapping("find/{id}")
	public Optional<CategoryDTO> getCategoryById(@PathVariable Integer id){
		return categoryservices.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCategoryById(@PathVariable Integer id) {
		return categoryservices.dltById(id);
	}

		
	

}
