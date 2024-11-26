package com.example.demo.productcontroller;



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
import com.example.demo.productentities.Product;
import com.example.demo.productservice.ProductService;

@RestController
public class ProductController {
    
	@Autowired
	public ProductService productservice;
	
	
	@GetMapping("/Product")
	public Page<Product> getProduct(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size)
	{
		return this.productservice.getProduct(PageRequest.of(page, size));
	}
	
	@GetMapping("/Product/{id}")
	public Product getOneProduct(@PathVariable Long id ) 
	{
		return this.productservice.getOneProduct(id);
	}
	
	@PostMapping("/Product")
	public Product addProduct(@RequestBody Product product) 
	{
		return this.productservice.addProduct(product);
	}
	@PutMapping("/Product/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody @Validated Category updatedProduct) 
	{
	return this.productservice.updateProduct(id, updatedProduct);	
	}
	
	@DeleteMapping("/Product/{id}")
	 public void deleteProduct(@PathVariable Long id) 
	 {
		productservice.deleteProduct(id);
	 }
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Long id) {
	    Product product = productservice.getProductById(id);
	    product.getCategory(); // Ensure category is fetched
	    return product;
	}
	@GetMapping
	public Page<Product> getAllProducts(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
	    return productservice.getAllProducts(PageRequest.of(page, size));
	}
}