package org.cibertec.edu.pe.Controller;

import java.util.ArrayList;
import java.util.List;

import org.cibertec.edu.pe.Models.Categorias;
import org.cibertec.edu.pe.Repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
    private ICategoriaRepository categoriaRepository;

    @GetMapping("/list")
    public String listarCategorias(Model model) {
        List<Categorias> categorias = categoriaRepository.findAll();
        model.addAttribute("categorias", categorias);
        return "categorias";
    }
}
