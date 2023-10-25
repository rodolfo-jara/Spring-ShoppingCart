package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.Models.Categorias;
import org.cibertec.edu.pe.Repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

	@Autowired
	private ICategoriaRepository categoriaRepository;
	
	public List<Categorias> getAllCategory(){
		return categoriaRepository.findAll();
	}
	public Optional<Categorias>  getCategoryById(int id) {
	return	categoriaRepository.findById(id);
	}
}
