package org.cibertec.edu.pe.Repository;

import java.util.List;

import org.cibertec.edu.pe.Models.Categorias;
import org.cibertec.edu.pe.Models.Productos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProductRepository extends JpaRepository<Productos, Integer> {
	List<Productos> findByCategoria(Categorias categoria);
}
