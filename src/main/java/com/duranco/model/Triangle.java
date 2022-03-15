package com.duranco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Triangle extends Polygone {
	@Column(nullable = false)
	private int base;
	@NotBlank
	private String types;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	
	
	
	
	
	
}
