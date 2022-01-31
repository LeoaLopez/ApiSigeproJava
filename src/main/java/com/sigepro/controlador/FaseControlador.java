package com.sigepro.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sigepro.DAOs.IFaseDAO;
import com.sigepro.modelo.Fase;
import com.sigepro.modelo.Personal;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class FaseControlador {
 @Autowired
 private IFaseDAO ifd;

	@GetMapping("fase/{idfase}")
	public Fase buscarFase(@PathVariable Integer idfase ){
	Fase fase= ifd.findById(idfase).orElseThrow();
	return fase;
	}
 @GetMapping("fase")
 public List<Fase> getFase(){
	 return this.ifd.findAll();
 }
}
