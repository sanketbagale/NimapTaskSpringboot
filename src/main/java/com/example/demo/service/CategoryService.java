package com.example.demo.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.demo.entities.Category;

public interface  CategoryService {
   
	public Page<Category> getCategory(PageRequest pageRequest);
	
	public  Category getOneCategory(Long id);

	public Category addcategory(Category Category);


	public Category updatecategory(Long id, Category updatedCategory);
	 
	public void deleteCategory(Long id) ;

	

	
	


} 
