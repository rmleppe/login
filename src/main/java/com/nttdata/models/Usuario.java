package com.nttdata.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity	//representcion de la entidad modelo (entidad = tablas)
@Table(name="usuarios")//nombre de la tabla en la bd

public class Usuario {

	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY) //auto incrementable
	private Long id;
	
	
	private String nombre;
	private String apellido;
	private String limite;
	private String codigoPostal;
	
	
	
	public Usuario() {
		super();
	}



	public Usuario(String nombre, String apellido, String limite, String codigoPostal) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.limite = limite;
		this.codigoPostal = codigoPostal;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getLimite() {
		return limite;
	}



	public void setLimite(String limite) {
		this.limite = limite;
	}



	public String getCodigoPostal() {
		return codigoPostal;
	}



	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	
	
}
