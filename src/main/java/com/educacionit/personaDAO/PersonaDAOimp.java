package com.educacionit.personaDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.educacionit.entidades.Persona;

@Service
public class PersonaDAOimp {
	@PersistenceContext
	private EntityManager em;
	public Persona buscarPorId(Integer id) {
		Query query= em.createQuery("select p from Persona p WHERE id=:id");
		query.setParameter("id", id);
		return (Persona)query.getSingleResult();
		}
	
	} 

