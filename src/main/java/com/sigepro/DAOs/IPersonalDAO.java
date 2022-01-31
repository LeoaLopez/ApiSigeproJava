package com.sigepro.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sigepro.modelo.Personal;

@Repository

public interface IPersonalDAO extends JpaRepository<Personal,Integer> {

}
