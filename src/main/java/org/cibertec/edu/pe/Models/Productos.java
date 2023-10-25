package org.cibertec.edu.pe.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

    private String nombre;
    private float PrecioUnidad;
    private String Imagen;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categorias categoria;
    
    
    

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
	public float getPrecioUnidad() {
		return PrecioUnidad;
	}
	public void setPrecioUnidad(float precioUnidad) {
		PrecioUnidad = precioUnidad;
	}
	public String getImagen() {
		return Imagen;
	}
	public void setImagen(String imagen) {
		Imagen = imagen;
	}
	public Categorias getCategoria() {
		return categoria;
	}
	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
    
    
   
    
    
}
