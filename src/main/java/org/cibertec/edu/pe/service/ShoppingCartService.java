package org.cibertec.edu.pe.service;

import java.util.List;

import org.cibertec.edu.pe.Models.Cliente;
import org.cibertec.edu.pe.Models.detalleCarrito;
import org.cibertec.edu.pe.Repository.IDetalleCarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {

	@Autowired
	private IDetalleCarritoRepository carritoRepo;
	
	public List<detalleCarrito> listDetalleCarrito(Cliente cliente){
		return carritoRepo.findByCliente(cliente);
	}
}
