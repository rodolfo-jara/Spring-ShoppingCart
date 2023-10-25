package org.cibertec.edu.pe.service;

import org.cibertec.edu.pe.Models.Cliente;

public interface ClienteService {
	
	Cliente registrarCliente(Cliente cliente);
    
	Cliente iniciarSesion(String correo, String password);
	
	  public Cliente getClienteById(int id);
}
