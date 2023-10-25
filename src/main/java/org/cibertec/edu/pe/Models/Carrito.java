package org.cibertec.edu.pe.Models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Carrito {
	private List<ItemCarrito> items;

    public Carrito() {
        items = new ArrayList<>();
    }

    public List<ItemCarrito> getItems() {
        return items;
    }

    public void agregarItem(ItemCarrito item) {
        items.add(item);
    }

	public Carrito(List<ItemCarrito> items) {
		super();
		this.items = items;
	}
	public void vaciar() {
	    items.clear(); 
	}

	public void setItems(List<ItemCarrito> items) {
		this.items = items;
	}
    
    
}
