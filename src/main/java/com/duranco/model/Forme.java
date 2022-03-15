package com.duranco.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
@Entity
public class Forme {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private double superficie;
private double surface;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSuperficie() {
	return superficie;
}
public void setSuperficie(double superficie) {
	this.superficie = superficie;
}
public double getSurface() {
	return surface;
}
public void setSurface(double surface) {
	this.surface = surface;
}






}
