package com.sigepro.modelo;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table
public class Tarea {
	@Id
	private int idtarea;
	//@Column
   // private int idfase;
	//@Column
  //  private int idproyecto_fase;
	@Column
    private String nombre;
	@Column
    private String descripcion;
	@Column
    private LocalDate fechaInicio;
	@Column
    private LocalDate fechaFin;
	@Column
    private int gradoAvance;
	@Column
    private float costo;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "legPersonal", referencedColumnName = "legajo")
    private Personal personal;
	
    public Tarea() {
	
	}
    
	public Tarea(int idtarea, String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin,
			int gradoAvance, float costo, Personal personal) {
		this.idtarea = idtarea;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.gradoAvance = gradoAvance;
		this.costo = costo;
		this.personal = personal;
	}

	public int getIdtarea() {
		return idtarea;
	}

	public void setIdtarea(int idtarea) {
		this.idtarea = idtarea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getGradoAvance() {
		return gradoAvance;
	}

	public void setGradoAvance(int gradoAvance) {
		this.gradoAvance = gradoAvance;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	@Override
	public String toString() {
		return "Tarea [idtarea=" + idtarea + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + ", gradoAvance=" + gradoAvance + ", costo=" + costo
				+ ", personal=" + personal + "]";
	}


    
}
