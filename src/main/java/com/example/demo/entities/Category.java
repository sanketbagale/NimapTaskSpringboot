package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.productentities.Product;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	 
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        
        
        @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private List<Product> products = new ArrayList<>();
        
		public Category(Long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public Category() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Category [id=" + id + ", name=" + name + "]";
		}
	   
        
}
