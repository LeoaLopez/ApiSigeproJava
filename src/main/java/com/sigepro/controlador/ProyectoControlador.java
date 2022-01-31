package com.sigepro.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sigepro.DAOs.IProyectoDAO;
import com.sigepro.modelo.Proyecto;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class ProyectoControlador {
@Autowired
private IProyectoDAO ipd;

	@GetMapping("proyecto/idproyecto")
	public Proyecto buscarProyecto(@PathVariable Integer idproyecto) {
		Proyecto pro=ipd.findById(idproyecto).orElseThrow();
		return pro;
	}
	@GetMapping("proyecto")
	public List<Proyecto>getProyecto(){
		return this.ipd.findAll();
	}
	
	@PostMapping("proyecto")
	public Proyecto crearProyecto(@RequestBody Proyecto proyecto) {
		return ipd.save(proyecto);
	}
	
}
