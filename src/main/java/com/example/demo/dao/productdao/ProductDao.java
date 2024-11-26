package com.example.demo.dao.productdao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.productentities.Product;


public interface ProductDao extends JpaRepository<Product,Long> {

}
