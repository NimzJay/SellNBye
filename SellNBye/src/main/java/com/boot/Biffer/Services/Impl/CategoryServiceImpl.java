package com.boot.Biffer.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.Biffer.Model.CategoryDTO;
import com.boot.Biffer.Repositories.CategoryRepository;
import com.boot.Biffer.Services.CategoryServices;

@Service
public class CategoryServiceImpl implements CategoryServices{
	
	@Autowired
	private CategoryRepository categoryRepo;
	
	@Override
	public List<CategoryDTO> findAllCategory(){
		
		List<CategoryDTO> allCategory =categoryRepo.findAll();
		return allCategory;
		
	}

	@Override
	public String saveCategory(CategoryDTO categorydata) {
		categoryRepo.save(categorydata);
		
		return "Successfully Saved";
	}

	@Override
	public String updateCategory(CategoryDTO newcategorydata) {
		String msg = null;		
		if(newcategorydata.getId() != null) {
			categoryRepo.save(newcategorydata);
			msg = "Successfully Updated.";
		}else {
			msg = "Update Error";
		}			
		
		return msg;
	}

	@Override
	public Optional<CategoryDTO> findById(Integer id) {
		
		Optional<CategoryDTO> sortCategories = categoryRepo.findById(id); 		
		return sortCategories;
	}

	@Override
	public String dltById(Integer id) {
		
		String msg = null;
		if(id != null) {
			categoryRepo.deleteById(id);
			msg = "Successfully Deleted.";
		}
		else {
			msg = "Deletion Error";
		}
		return msg;
	}
	
}
