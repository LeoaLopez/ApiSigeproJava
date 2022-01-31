package com.sigepro.controlador;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sigepro.DAOs.IProvinciaDAO;
import com.sigepro.modelo.Provincia;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class ProvinciaControlador {
@Autowired
private IProvinciaDAO ipd;
	@PersistenceContext
	private EntityManager em;
	public Provincia buscarPorId(Integer id) {
		Query query= em.createQuery("select p from Provincia p WHERE id=:id");
		query.setParameter("id", id);
		return (Provincia)query.getSingleResult();
		}
	
	@GetMapping("provincia")
	public List<Provincia> getProvincia(){
		return this.ipd.findAll();
	}
}
