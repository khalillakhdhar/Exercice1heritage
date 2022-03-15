package com.duranco.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Departement {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;



@Column(unique = true)
private String titre;
@OneToOne(mappedBy ="departement")
private Chef chef;

public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getTitre() {
	return titre;
}


public void setTitre(String titre) {
	this.titre = titre;
}






}
