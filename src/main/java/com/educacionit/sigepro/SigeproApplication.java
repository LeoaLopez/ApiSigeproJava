package com.educacionit.sigepro;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;

//import com.educacionit.entidades.Cliente;
import com.educacionit.entidades.Persona;
import com.educacionit.entidades.Telefono;
import com.educacionit.personaDAO.*;
import com.educacionit.personaDAO.*;
import com.educacionit.personaDAO.IPersonaDAO;
import com.sigepro.DAOs.*;
import com.sigepro.DAOs.IClienteDAO;
import com.sigepro.controlador.*;
import com.sigepro.modelo.*;

@SpringBootApplication
/*@ComponentScan({"com.educacionit"})
@EntityScan("com.educacionit")
@EnableJpaRepositories("com.educacionit")*/


@ComponentScan({"com.sigepro"})
@EntityScan("com.sigepro")
@EnableJpaRepositories("com.sigepro")
public class SigeproApplication implements CommandLineRunner {
	/*@Autowired//permite inyectar dependencias, unas con otras
	IPersonaDAO pd;
	@Autowired
    IClienteDAO cd;
	@Autowired
	ClienteDAOimp cdi;
	@Autowired
	PersonaDAOimp pdi;*/
	@Autowired
	IProvinciaDAO ipd;
	@Autowired
	IClienteDAO icd;
	@Autowired
	ClienteControlador cc;
	@Autowired 
	IPersonalDAO ipersonald;
	@Autowired
	ProvinciaControlador pc;
	@Autowired
	RolPersonalControlador rpc;
	@Autowired
	PersonalControlador personalc;
	@Autowired
	TareaControlador tc;
	@Autowired
	FaseControlador fc;
	@Autowired
	ITareaDAO itd;
	@Autowired
	IProyectoDAO iprod;
	@Autowired
	ProyectoControlador procon;
	
	public static void main(String[] args) {
		SpringApplication.run(SigeproApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
	//int idcliente, String razonSocial, int cuit, String email, int telefono, Localidad localidad
	/*Localidad l1=new Localidad();
	l1.setCodigo_postal(4109);
	l1.setNombre("Banda de Rio Sali");
	Provincia pro=pc.buscarPorId(1);
	l1.setIdprovincia(pro.getIdProvincia());
	il.save(l1);*/
	
	/*Cliente c1 = new Cliente();
	c1.setRazonSocial("Edet");
	c1.setCuit(34522);
	Localidad loc=lc.buscarPorId(4109);
	c1.setLocalidad(loc.getCodigo_postal());
	c1.setEmail("edet@gmail.com");
	c1.setTelefono(4255533);
	icd.save(c1);*/
		/*RolPersonal rp=new RolPersonal();
		rp.setTipo("Developer");*/
	/*Personal p1 = new Personal();
	p1.setLegajo(1);
	p1.setApellido("Casas");
	p1.setDni(13495667);
	p1.setNombre("Pedro");
	RolPersonal rol1=rpc.buscarPorId(2);
	p1.setRolpersonal(rol1);
	ipersonald.save(p1);*/
	
	/*Personal p2 = new Personal();
	p2.setLegajo(2);
	p2.setApellido("Torres");
	p2.setDni(1694927);
	p2.setNombre("Luis");
	RolPersonal rol=rpc.buscarPorId(3);
	System.out.println(rol.toString());
	p2.setRolpersonal(rol);
	ipersonald.save(p2);*/
	//Personal p=personalc.buscarPersonal(1);
	//RolPersonal rol=rpc.buscarPorId(p.getRolpersonal());
	
	//System.out.println(p.getApellido()+ " "+ rol.getId()+" tipo: "+rol.getTipo());
		
	/*Cliente c1= new Cliente();
	c1.setCuit(2244);
	c1.setRazonSocial("La Sevillanita");
	c1.setEmail("sevi@gmail.com");
	c1.setTelefono(4224566);
	Provincia p= pc.buscarPorId(1);
	c1.setProvincia(p);
	icd.save(c1);*/
		
	/*Tarea t1= new Tarea();
	t1.setIdtarea(10);
	t1.setNombre("Desarrollo");
	t1.setDescripcion("Desarollo en .NET");
	t1.setGradoAvance(50);
	Date di= new Date();
	t1.setFechaInicio(LocalDate.of(2022, 07, 02));
	t1.setFechaFin(LocalDate.of(2023, 03, 12));
	Personal p= personalc.buscarPersonal(2);
	t1.setPersonal(p);
	List <Tarea> list= new ArrayList<Tarea>();
	list.add(t1);
	tc.crearTarea(list);
	for(Tarea t: list) {
		System.out.println(t);
	}
		*/
		//System.out.println(LocalDate.of(2023, 03, 12));
		
	
	/*Proyecto p=new Proyecto();
	p.setIdproyecto(1);
	p.setDescripcion("Everis");
	Cliente c=cc.buscarCliente(1);
	p.setCliente(c);
	p.setAvancePromedio(30);
	Fase f= fc.buscarFase(2);
	p.setFase(f);
	p.setCostoProyecto(8000);
	p.setResponsableProyecto("Nicolas Cage");
	Tarea t1=tc.buscarTarea(10);
	Tarea t2=tc.buscarTarea(11);
	List <Tarea> list= new ArrayList<Tarea>();
	list.add(t1);
	list.add(t2);
	p.setTareas(list);
	iprod.save(p);*/
		System.out.println(procon.buscarProyecto(1));
	}
		

		
			
		
		
		}


