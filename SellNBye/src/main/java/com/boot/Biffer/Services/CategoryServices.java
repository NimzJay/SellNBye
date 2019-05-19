package com.boot.Biffer.Services;

import com.boot.Biffer.Model.CategoryDTO;
import java.util.List;
import java.util.Optional;

public interface CategoryServices {
	
	List<CategoryDTO> findAllCategory();
	
	String saveCategory(CategoryDTO categorydata);
	
	String updateCategory(CategoryDTO newcategorydata);
	
	Optional<CategoryDTO> findById(Integer id);
	
	String dltById(Integer id);

}
