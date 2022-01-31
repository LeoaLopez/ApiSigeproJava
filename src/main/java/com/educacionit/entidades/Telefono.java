package com.educacionit.entidades;

import javax.persistence.*;

@Entity
@Table
public class Telefono {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column
	private String tipo;
	@Column
	private Integer numero;
	@ManyToOne(fetch=FetchType.EAGER)//recupera la entidad solo cuando sea necesario
	private Persona persona;
	public Telefono(Integer id, String tipo, Integer numero) {
	
		this.id = id;
		this.tipo = tipo;
		this.numero = numero;
	}
	public Telefono() {
		
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
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	@Override
	public String toString() {
		return "Telefono [id=" + id + ", tipo=" + tipo + ", numero=" + numero + "]";
	}
	
	
}
