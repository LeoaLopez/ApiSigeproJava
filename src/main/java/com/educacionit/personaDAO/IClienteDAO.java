package com.educacionit.personaDAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

import com.educacionit.entidades.Cliente;
@Repository
@Service
public interface IClienteDAO extends CrudRepository<Cliente,Integer>{

}
