package com.sigepro.modelo;

import javax.persistence.*;

@Entity
@Table
public class Personal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer legajo;
	@Column
    private String apellido;
	@Column
    private String nombre;
	@Column
    private int dni;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "rolId", referencedColumnName = "id")
	//@Column
	private RolPersonal rolpersonal;
	/*@Enumerated(EnumType.STRING)
    private RolPersonal rolPersonal ;*/
	
    public Personal() {
	}

	public Personal(Integer legajo, String apellido, String nombre, int dni, RolPersonal rolpersonal) {
		
		this.legajo = legajo;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.rolpersonal = rolpersonal;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public RolPersonal getRolpersonal() {
		return rolpersonal;
	}

	public void setRolpersonal(RolPersonal rolpersonal) {
		this.rolpersonal = rolpersonal;
	}

	@Override
	public String toString() {
		return "Personal [legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni
				+ ", rolpersonal=" + rolpersonal + "]";
	}

}
