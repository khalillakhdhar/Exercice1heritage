package com.duranco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
@Entity
public class Cercle extends Forme {

	@NotNull
	private int centreX;
	@Column(nullable = false)
	private int centreY;
	public int getCentreX() {
		return centreX;
	}
	public void setCentreX(int centreX) {
		this.centreX = centreX;
	}
	public int getCentreY() {
		return centreY;
	}
	public void setCentreY(int centreY) {
		this.centreY = centreY;
	}
	
	
	
	
}
