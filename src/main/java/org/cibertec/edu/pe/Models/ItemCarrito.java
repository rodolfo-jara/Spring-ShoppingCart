package org.cibertec.edu.pe.Models;
public class ItemCarrito {
	
    private Productos producto;
    private int cantidad;

    public ItemCarrito(Productos producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Productos getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
    
}
