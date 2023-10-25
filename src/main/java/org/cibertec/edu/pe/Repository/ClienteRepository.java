package org.cibertec.edu.pe.Repository;

import org.cibertec.edu.pe.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	Cliente findById(int id);
	Cliente findByCorreoAndPassword(String correo, String password);

	
}
