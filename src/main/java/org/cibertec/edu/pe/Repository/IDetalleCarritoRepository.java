package org.cibertec.edu.pe.Repository;

import java.util.List;

import org.cibertec.edu.pe.Models.Cliente;
import org.cibertec.edu.pe.Models.detalleCarrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleCarritoRepository extends JpaRepository<detalleCarrito, Integer>{
	
	public List<detalleCarrito> findByCliente(Cliente cliente);
}
