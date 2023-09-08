package com.empresa.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
@Setter
@	Getter

@Entity
@Table(name="concurso")

public class Concurso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConcurso;
	private String nombre;
	private String estado;
	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fechaInicio;
	private Date fechaFin;
	

}

