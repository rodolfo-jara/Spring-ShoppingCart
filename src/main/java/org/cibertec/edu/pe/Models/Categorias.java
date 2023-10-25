package org.cibertec.edu.pe.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity

public class Categorias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    // Campos o Atributos
    private Integer id;
    private String nombre;
    private String Imagen;
    
    
	public Categorias() {
		super();
	}


	public Categorias(Integer id, String nombre, String imagen) {
		super();
		this.id = id;
		this.nombre = nombre;
		Imagen = imagen;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getImagen() {
		return Imagen;
	}


	public void setImagen(String imagen) {
		Imagen = imagen;
	}



	
   
    
}