package com.educacionit.personaDAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.educacionit.entidades.Telefono;

@Repository
public interface ITelefonoDAO extends CrudRepository<Telefono,Integer>{

}
