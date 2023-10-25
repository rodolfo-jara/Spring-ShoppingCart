package org.cibertec.edu.pe.Controller;

import java.util.ArrayList;
import java.util.List;

import org.cibertec.edu.pe.Models.Categorias;
import org.cibertec.edu.pe.Models.Productos;
import org.cibertec.edu.pe.Repository.ICategoriaRepository;
import org.cibertec.edu.pe.Repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductController {
	 @Autowired
	    private ICategoriaRepository categoriaRepository;
	    
	    @Autowired
	    private IProductRepository productoRepository;
	


	@GetMapping("/index")
	public String listado(Model model) {
		List<Productos> lista = new ArrayList<>();
		lista = productoRepository.findAll();
		model.addAttribute("productos", lista);
		return "index";
	}
	
	@GetMapping("/porCategoria/{categoriaId}")
    public String listarProductosPorCategoria(@PathVariable Integer categoriaId, Model model) {
        Categorias categoria = categoriaRepository.findById(categoriaId).orElse(null);

        if (categoria != null) {
            List<Productos> productos = productoRepository.findByCategoria(categoria);
            model.addAttribute("productos", productos);
            model.addAttribute("categoria", categoria);
        }

        return "productosPorCategoria";
    }
	
}
