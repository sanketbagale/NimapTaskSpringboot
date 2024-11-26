package com.example.demo.productentities;
import com.example.demo.entities.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;




@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)	
  private long id;
  private String name;
  private double prise;
 
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id")
  private Category category;
  
public Product(long id, String name, String description, int prise) {
	super();
	this.id = id;
	this.name = name;
	this.prise = prise;
}

public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public double getPrise() {
	return prise;
}
public void setPrise(double prise) {
	this.prise = prise;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", prise=" + prise + "]";
}

public void getCategory() {
	// TODO Auto-generated method stub
	
}



}
