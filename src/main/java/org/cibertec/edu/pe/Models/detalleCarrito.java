package org.cibertec.edu.pe.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_carrito")
public class detalleCarrito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Productos product;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	private int  cantidad;
	
	
	
	public detalleCarrito() {
		super();
	}



	public detalleCarrito(Integer id, Productos product, Cliente cliente, int cantidad) {
		super();
		this.id = id;
		this.product = product;
		this.cliente = cliente;
		this.cantidad = cantidad;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Productos getProduct() {
		return product;
	}



	public void setProduct(Productos product) {
		this.product = product;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
