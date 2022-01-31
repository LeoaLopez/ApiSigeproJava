package com.sigepro.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sigepro.DAOs.ITareaDAO;
import com.sigepro.modelo.Personal;
import com.sigepro.modelo.Tarea;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class TareaControlador {
@Autowired
private ITareaDAO itd;

	@GetMapping("tarea/{idtarea}")
	public Tarea buscarTarea(@PathVariable Integer idTarea ){
	Tarea tarea= itd.findById(idTarea).orElseThrow();
	return tarea;
	}
	@GetMapping("tarea")
	public List<Tarea> getTarea(){
		return this.itd.findAll();
	}
	
	//crear nuevas tareas
	@PostMapping("tarea")
	public List<Tarea> crearTarea(@RequestBody List<Tarea> tarea){
		return itd.saveAll(tarea);
	}
}
