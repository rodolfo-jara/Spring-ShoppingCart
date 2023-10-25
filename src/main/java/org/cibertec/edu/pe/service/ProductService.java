package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.Models.Categorias;
import org.cibertec.edu.pe.Models.Productos;
import org.cibertec.edu.pe.Repository.ICategoriaRepository;
import org.cibertec.edu.pe.Repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private IProductRepository productRepository;
	
	public List<Productos> getAllProductos(){
		return productRepository.findAll();
	}
	public Optional<Productos>  getProductById(int id) {
	return	productRepository.findById(id);
	}
}
