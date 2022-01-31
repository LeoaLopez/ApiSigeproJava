package com.educacionit.personaDAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.educacionit.entidades.Persona;
@Repository
@Service
public interface IPersonaDAO extends CrudRepository<Persona,Integer>{
	
}
