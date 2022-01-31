package com.sigepro.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sigepro.modelo.RolPersonal;

@Repository
public interface IRolPersonalDAO extends JpaRepository<RolPersonal,Integer> {

}
