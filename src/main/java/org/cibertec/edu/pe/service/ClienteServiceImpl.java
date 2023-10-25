package org.cibertec.edu.pe.service;

import org.cibertec.edu.pe.Models.Cliente;
import org.cibertec.edu.pe.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ClienteServiceImpl implements ClienteService  {
	@Autowired
    private ClienteRepository clienteRepository; 

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    
    public Cliente registrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

	@Override
	public Cliente iniciarSesion(String correo, String password) {
		return clienteRepository.findByCorreoAndPassword(correo, password);
	}
	@Override
	public Cliente getClienteById(int id) {
		Cliente cliente = clienteRepository.findById(id);
        return cliente;
	}


	

   


	


	
	
}
