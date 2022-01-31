package com.sigepro.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sigepro.DAOs.IClienteDAO;
import com.sigepro.modelo.Cliente;
import com.sigepro.modelo.Personal;;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class ClienteControlador {
@Autowired
private IClienteDAO ic;

	@GetMapping("cliente/{idcliente}")
	public Cliente buscarCliente(@PathVariable Integer idcliente) {
		Cliente cliente=ic.findById(idcliente).orElseThrow();
		return cliente;
	}

	//mostrar listado de clientes disponibles en la db
	@GetMapping("cliente")
	public List<Cliente> getCliente() {
	return this.ic.findAll();
		}
	
	// crear nuevo cliente
	@PostMapping("cliente")
	public Cliente crearCliente(@RequestBody Cliente cliente) {
	return ic.save(cliente);
			}

/*@GetMapping("personal/{legajo}")
		public Personal buscarPersonal(@PathVariable Integer legajo ){
		Personal personal= ip.findById(legajo).orElseThrow();
		return  personal;
		}*/
}
