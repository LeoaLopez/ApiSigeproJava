package com.sigepro.modelo;

import javax.persistence.*;

@Entity
@Table
public class Provincia {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idProvincia;
	@Column
	private String nombre;
	
	public Provincia() {
	
	}
	public Provincia(Integer idProvincia, String nombre) {
	
		this.idProvincia = idProvincia;
		this.nombre = nombre;
	}
	public Integer getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(Integer idProvincia) {
		this.idProvincia = idProvincia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
