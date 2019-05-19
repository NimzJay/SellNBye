package com.boot.Biffer.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.Biffer.Model.CategoryDTO;

public interface CategoryRepository extends JpaRepository<CategoryDTO, Integer> {
	
	//getAllCategory
	//findById
	//delete
	//update
	//custom  Query

}
