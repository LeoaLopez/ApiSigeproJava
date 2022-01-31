package com.sigepro.controlador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sigepro.DAOs.IRolPersonalDAO;
import com.sigepro.modelo.Personal;
import com.sigepro.modelo.RolPersonal;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class RolPersonalControlador {
	@Autowired
	private IRolPersonalDAO irp;
	@PersistenceContext
	private EntityManager em;
	public RolPersonal buscarPorId(Integer id) {
		Query query= em.createQuery("select p from RolPersonal p WHERE id=:id");
		query.setParameter("id", id);
		return (RolPersonal)query.getSingleResult();
		}
	
		@GetMapping("rolPersonal")
		public List<RolPersonal> getRolPersonal(){
			return this.irp.findAll();
		}
		
	

}
