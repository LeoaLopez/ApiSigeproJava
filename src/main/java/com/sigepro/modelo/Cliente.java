package com.sigepro.modelo;

import javax.persistence.*;

@Entity
@Table
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idcliente;
	@Column
    private String razonSocial;
	@Column
    private int cuit;
	@Column
    private String email;
	@Column
    private int telefono;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idProv", referencedColumnName = "idProvincia")
    private Provincia provincia;
	
	public Cliente(Integer idcliente, String razonSocial, int cuit, String email, int telefono, Provincia provincia) {
	
		this.idcliente = idcliente;
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.email = email;
		this.telefono = telefono;
		this.provincia = provincia;
	}

	public Cliente() {
	
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	
    
}
