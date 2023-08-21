package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.service.PropietarioService;

@SpringBootApplication
public class Pa2U4P4JoApplication implements CommandLineRunner{
	@Autowired
	private PropietarioService propietarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U4P4JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Propietario prop=new Propietario();
		prop.setNombre("Jimmy");
		prop.setCedula("010");
		prop.setApellido("Ortega");
		propietarioService.insertar(prop);
	
	}

}
