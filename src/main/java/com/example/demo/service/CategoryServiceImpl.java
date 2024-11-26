package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CategoryDao;
import com.example.demo.entities.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
    
	//List<Category> list;
	//public CategoryServiceImpl() {
	//	list=new ArrayList<>();
	//	list.add(new Category((long) 101,"Milk","Milk Products"));
	//	list.add(new Category((long) 102,"Masala","Masala Products"));
	//	list.add(new Category((long) 103,"Swits","Swits Products"));
	//}
	
	@Autowired
	public CategoryDao categoryDao;

	@Override
	public Page<Category> getCategory(PageRequest pageRequest) {
		
		return this.categoryDao.findAll(pageRequest);
	}

	@Override
	public Category getOneCategory(Long id) {
		// TODO Auto-generated method stub
		return this.categoryDao.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
	}

	@Override
	public Category addcategory(Category Category) {
		// TODO Auto-generated method stub
		return categoryDao.save(Category);
	}

	@Override
	public Category updatecategory(Long id, Category updatedCategory) {
		// TODO Auto-generated method stub
		return categoryDao.save(updatecategory(id, updatedCategory));
		
	}

	@Override
	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
	 categoryDao.deleteById(id);
	}
	
	
	

}


