package com.sigepro.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.*;

import com.sigepro.modelo.Cliente;



@Repository
@Service
public interface IClienteDAO extends JpaRepository<Cliente,Integer> {

}
