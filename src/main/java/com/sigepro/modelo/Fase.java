package com.sigepro.modelo;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table
public class Fase {

	@Id
	private Integer idFase;
	@Column
	private String fase;

	public Fase() {
	}

public Fase(Integer idFase, String fase) {

	this.idFase = idFase;
	this.fase = fase;
}

public Integer getIdFase() {
	return idFase;
}

public void setIdFase(Integer idFase) {
	this.idFase = idFase;
}

public String getFase() {
	return fase;
}

public void setFase(String fase) {
	this.fase = fase;
}	
	
	
	
}
