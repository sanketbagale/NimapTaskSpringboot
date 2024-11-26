package com.example.demo.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Category;
import com.example.demo.service.CategoryService;

@RestController
public class MyController {
     
	@Autowired
	private CategoryService categorySerice;
	
	

	
	@GetMapping("/Category")
	public Page<Category> getCategory(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size)
	{
		return this.categorySerice.getCategory(PageRequest.of(page, size));
	}
	
	@GetMapping("/Category/{id}")
	public Category getOneCategory(@PathVariable Long id ) 
	{
		return this.categorySerice.getOneCategory(id);
	}
	
	@PostMapping("/Category")
	public Category addcategory(@RequestBody Category Category) 
	{
		return this.categorySerice.addcategory(Category);
	}
	@PutMapping("/Category/{id}")
	public Category updatecategory(@PathVariable Long id, @RequestBody @Validated Category updatedCategory) 
	{
	return this.categorySerice.updatecategory(id, updatedCategory);	
	}
	
	 public void deleteProduct(@PathVariable Long id) 
	 {
		 categorySerice.deleteCategory(id);
	 }
	}
	
	


