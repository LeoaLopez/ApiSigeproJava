package com.sigepro.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Proyecto {
	@Id
	private int idproyecto;
	@Column
    private String descripcion;
	@Column
    private float avancePromedio;
	@Column
    private float costoProyecto;
	@Column
    private String responsableProyecto;
	//@Column
    //private boolean visibilidad;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idCliente", referencedColumnName = "idcliente")
    private Cliente cliente;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idFase", referencedColumnName = "idfase")
	private Fase fase;
   
    @OneToMany(cascade=CascadeType.ALL,orphanRemoval=true,fetch=FetchType.EAGER)
    private List<Tarea> tareas;
	
    public Proyecto() {
	}

	public Proyecto(int idproyecto, String descripcion, float avancePromedio, float costoProyecto,
			String responsableProyecto, Cliente cliente, Fase fase, List<Tarea> tareas) {
		this.idproyecto = idproyecto;
		this.descripcion = descripcion;
		this.avancePromedio = avancePromedio;
		this.costoProyecto = costoProyecto;
		this.responsableProyecto = responsableProyecto;
		this.cliente = cliente;
		this.fase = fase;
		this.tareas = tareas;
	}

	public int getIdproyecto() {
		return idproyecto;
	}

	public void setIdproyecto(int idproyecto) {
		this.idproyecto = idproyecto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getAvancePromedio() {
		return avancePromedio;
	}

	public void setAvancePromedio(float avancePromedio) {
		this.avancePromedio = avancePromedio;
	}

	public float getCostoProyecto() {
		return costoProyecto;
	}

	public void setCostoProyecto(float costoProyecto) {
		this.costoProyecto = costoProyecto;
	}

	public String getResponsableProyecto() {
		return responsableProyecto;
	}

	public void setResponsableProyecto(String responsableProyecto) {
		this.responsableProyecto = responsableProyecto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	@Override
	public String toString() {
		return "Proyecto [idproyecto=" + idproyecto + ", descripcion=" + descripcion + ", avancePromedio="
				+ avancePromedio + ", costoProyecto=" + costoProyecto + ", responsableProyecto=" + responsableProyecto
				+ ", cliente=" + cliente + ", fase=" + fase + ", tareas=" + tareas + "]";
	}


}
