package com.nttdata.models;

public class Proveedor {

	private String nombre;
	private String apellido;
	private String email;
	private Integer edad;
	
	//constructores
	public Proveedor() {
		super();
	}


	public Proveedor(String nombre, String apellido, String email, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.edad = edad;
	}


	//getters and setters
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	
	//metodos

	@Override
	public String toString() {
		return "Proveedor [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", edad=" + edad + "]";
	}
	

	
	
	
	
	
	
	
	
}
