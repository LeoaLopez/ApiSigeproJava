package com.educacionit.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



@Entity
@Table
public class Persona {

	@Id//define la PK
	@GeneratedValue(strategy=GenerationType.AUTO)//autoincremento
	private Integer id;
	@Column
	private int dni;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private int edad;
	@OneToMany(mappedBy="persona",cascade=CascadeType.ALL,orphanRemoval=true,fetch=FetchType.EAGER)
	private List<Telefono> telefonos= new ArrayList<>();
	//cascada: bd propagar operaciones
	//orphan no bd eliminar referencia al borrar un item de la coleccion
	public Persona() {
		
	}

	public Persona(Integer id, int dni, String nombre, String apellido, int edad) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	public void agregarTelefonos(Telefono telefono) {
		telefonos.add(telefono);
		telefono.setPersona(this);//probar esto si hace falta
	}

	public void eliminarTelefono(Telefono telefono) {
		telefonos.remove(telefono);
		telefono.setPersona(null);
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ "]";
	}
	
	
	
}
