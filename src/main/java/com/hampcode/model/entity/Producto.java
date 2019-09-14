package com.hampcode.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Producto {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


private String name;
private Long supplier;
private Long category;

@Column(name="unit_price",nullable=false)
private Double unit_price;

@Column(name="units_in_stock",nullable=false)
private Double units_in_stock;



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

public Long getSupplier() {
	return supplier;
}

public void setSupplier(Long supplier) {
	this.supplier = supplier;
}

public Long getCategory() {
	return category;
}

public void setCategory(Long category) {
	this.category = category;
}

public Double getUnit_price() {
	return unit_price;
}

public void setUnit_price(Double unit_price) {
	this.unit_price = unit_price;
}

public Double getUnits_in_stock() {
	return units_in_stock;
}

public void setUnits_in_stock(Double units_in_stock) {
	this.units_in_stock = units_in_stock;
}






	

}
