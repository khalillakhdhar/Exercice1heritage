package com.duranco.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Chef {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
private String nom;
@OneToOne(cascade =CascadeType.ALL)
@JoinColumn(name = "departement", referencedColumnName = "titre")
private Departement departement;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Departement getDepartement() {
	return departement;
}
public void setDepartement(Departement departement) {
	this.departement = departement;
}



}
