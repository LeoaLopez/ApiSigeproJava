package com.sigepro.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

import com.educacionit.entidades.Persona;
import com.sigepro.modelo.Provincia;

@Repository
@Service
public interface IProvinciaDAO extends JpaRepository<Provincia,Integer> {

}
