package com.example.demo.productservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.dao.productdao.ProductDao;
import com.example.demo.entities.Category;
import com.example.demo.productentities.Product;

@Service
public class ProductServiceImpl implements ProductService {
    
	@Autowired
	public ProductDao productdao;
	private Object updateProduct;

	@Override
	public Page<Product> getProduct(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return this.productdao.findAll(pageRequest);
	}

	@Override
	public Product getOneProduct(Long id) {
		// TODO Auto-generated method stub
		return this.productdao.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return  productdao.save(product);
	}

	@Override
	public Product updateProduct(Long id, Category updatedProduct) {
		// TODO Auto-generated method stub
		return productdao.save(updateProduct(id,updatedProduct));
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		productdao.deleteById(id);
	}

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Product> getAllProducts(PageRequest of) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
