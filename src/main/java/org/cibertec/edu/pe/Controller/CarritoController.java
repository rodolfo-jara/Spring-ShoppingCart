package org.cibertec.edu.pe.Controller;

import org.cibertec.edu.pe.Models.Carrito;
import org.cibertec.edu.pe.Models.ItemCarrito;
import org.cibertec.edu.pe.Models.Productos;
import org.cibertec.edu.pe.Repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/carrito")
@SessionAttributes("carrito")
public class CarritoController {
	@Autowired
    private IProductRepository productoRepository;
    private final Carrito carrito;

    
    public CarritoController(Carrito carrito) {
        this.carrito = carrito;
    }

    @GetMapping
    public String verCarrito(Model model) {
        model.addAttribute("carrito", carrito);
        return "carrito";
    }
    @GetMapping("/agregar/{id}/{cantidad}")
    public String agregarAlCarrito(@PathVariable Integer id, @PathVariable Integer cantidad,Model model) {
        Productos producto = productoRepository.findById(id).orElse(null);

        if (producto != null) {
            for (ItemCarrito item : carrito.getItems()) {
                if (item.getProducto().getId().equals(producto.getId())) { 
                    item.setCantidad(item.getCantidad() + cantidad);
                    return "redirect:/productos/index";
                }
            }
            ItemCarrito item = new ItemCarrito(producto, cantidad);
            carrito.agregarItem(item);
        }
        return "redirect:/productos/index";
    }
    @GetMapping("/agregar2/{id}/{cantidad}")
    public String agregarAlCarritos(@PathVariable Integer id, @PathVariable Integer cantidad,Model model) {
        Productos producto = productoRepository.findById(id).orElse(null);

        if (producto != null) {
            for (ItemCarrito item : carrito.getItems()) {
                if (item.getProducto().getId().equals(producto.getId())) { 
                    item.setCantidad(item.getCantidad() + cantidad);
                    return "redirect:/categoria/list";
                }
            }
            ItemCarrito item = new ItemCarrito(producto, cantidad);
            carrito.agregarItem(item);
        }
        return "redirect:/categoria/list";
    }
    
    
    
    
    
    @GetMapping("/vaciar")
    public String vaciarCarrito() {
        carrito.vaciar();
        return "redirect:/carrito";
    }
    @GetMapping("/vaciarcarrito")
    public String vaciarCarritos() {
        carrito.vaciar(); 
        return "pagoDetails";
    }

}

