package com.empresa.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empresa.entity.Alumno;
import com.empresa.service.AlumnoService;

@Controller
public class AlumnoController {
	
	@Autowired
	private AlumnoService service;

	
	@GetMapping(value = "/verAlumno" )
	public String ver() {
		return "registraAlumno";
	}
	
	@PostMapping("/registraAlumno")
	@ResponseBody
	public HashMap<?, ?> inserta(Alumno obj)
	{
		HashMap<String, String> salida = new HashMap<>()	;
		
		Alumno objSalida = service.insertaAlumno(obj);
		if(objSalida == null) {
			salida.put("MENSAJE", "Error en el registro");
			
		}else {
			salida.put("MENSAJE", "Registro exitoso");
		}
		return  salida;
		
	
				}
}
