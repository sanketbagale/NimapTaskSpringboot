package com.example.demo.productservice;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.demo.entities.Category;
import com.example.demo.productentities.Product;

public interface ProductService {
	public Page<Product> getProduct(PageRequest pageRequest);

	public Product getOneProduct(Long id);

	public Product addProduct(Product product);

	public Product updateProduct(Long id, Category updatedProduct);

	public void deleteProduct(Long id);

	public Product getProductById(Long id);

	public Page<Product> getAllProducts(PageRequest of);
	
	

}
