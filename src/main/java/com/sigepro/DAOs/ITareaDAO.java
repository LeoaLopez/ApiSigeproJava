package com.sigepro.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sigepro.modelo.Tarea;

@Repository
@Service
public interface ITareaDAO extends JpaRepository<Tarea,Integer> {

}
