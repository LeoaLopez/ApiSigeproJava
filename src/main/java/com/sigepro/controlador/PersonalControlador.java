package com.sigepro.controlador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.sigepro.DAOs.IPersonalDAO;
import com.sigepro.DAOs.IRolPersonalDAO;
import com.sigepro.modelo.Personal;
import com.sigepro.modelo.RolPersonal;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")

public class PersonalControlador {
@Autowired
private IPersonalDAO ip;
@Autowired
private RolPersonalControlador rol;
	/*@GetMapping("personal/{id}")
	//@PersistenceContext
	//private EntityManager em;
	public String buscarPorId(@PathVariable Integer id) {
		/*Query query= em.createQuery("select p from Personal p WHERE id=:id");
		query.setParameter("id", id);*/
		//return (Personal)query.getSingleResult();
		/*return this.ip.getById(id).toString();
		}*/

		@GetMapping("personal/{legajo}")
		public Personal buscarPersonal(@PathVariable Integer legajo ){
		Personal personal= ip.findById(legajo).orElseThrow();
		return  personal;
		}
	
		@GetMapping("personal")
		public List<Personal> getPersonal() {
		return this.ip.findAll();
		}
		// crear nuevo personal
		@PostMapping("personal")
		public Personal crearUsuario(@RequestBody Personal personal) {
		return ip.save(personal);
		}
		
		// eliminar Personal
		@DeleteMapping("/personal/{id}")
		public void borrarPersonal(@PathVariable Integer id) {
			Personal p = ip.findById(id).orElseThrow();
			ip.delete(p);
			System.out.println("borrado");
		}
		
		//editar personal
		@PutMapping("/personal/{id}")
		public ResponseEntity<Personal> modificarUsuario(@PathVariable Integer id, @RequestBody Personal personal){
			Personal p = ip.findById(id).orElseThrow();
			p.setNombre(personal.getNombre());
			p.setApellido(personal.getApellido());
			p.setDni(personal.getDni());
			p.setRolpersonal(personal.getRolpersonal());		
			Personal dato = ip.save(p);
			return ResponseEntity.ok(dato);
		}
}
