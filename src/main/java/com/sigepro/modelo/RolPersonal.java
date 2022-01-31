package com.sigepro.modelo;

import javax.persistence.*;

@Entity
@Table
public class RolPersonal {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column
	private String tipo;
	
	public RolPersonal(Integer id, String tipo) {
		
		this.id = id;
		this.tipo = tipo;
	}
	public RolPersonal() {
	
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "RolPersonal [id=" + id + ", tipo=" + tipo + "]";
	}
	
	
}
