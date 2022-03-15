package com.duranco.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Rectangle extends Polygone {

	@NotNull
	private int hauteur;
	@NotNull 
	private int largeur;
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	
	
	
	
}
