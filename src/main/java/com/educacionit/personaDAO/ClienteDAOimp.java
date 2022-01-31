package com.educacionit.personaDAO;

import java.util.List;

import javax.persistence.*;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.*;

@Service
public class ClienteDAOimp {

	@PersistenceContext
	private EntityManager em;
	public List buscarPorNombre(Integer id) {
		Query query= em.createQuery("select p from Cliente p WHERE id=:id");
		query.setParameter("id", id);
		return query.getResultList();
		}
}
