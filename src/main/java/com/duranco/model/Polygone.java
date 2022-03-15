package com.duranco.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Min;

@MappedSuperclass
public abstract class Polygone extends Forme {
	@Min(value = 2)
	@Column(nullable = false)
	private int angle;

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

}
