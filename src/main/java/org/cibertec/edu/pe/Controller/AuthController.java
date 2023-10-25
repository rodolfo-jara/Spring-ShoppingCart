package org.cibertec.edu.pe.Controller;

import javax.validation.Valid;

import org.cibertec.edu.pe.Models.Carrito;
import org.cibertec.edu.pe.Models.Cliente;
import org.cibertec.edu.pe.service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller

@SessionAttributes("carrito")
public class AuthController {
	@Autowired
    private ClienteServiceImpl clienteService;

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "formularioRegistro";
    }
    @PostMapping("/registro")
    public String registrarUsuario(@ModelAttribute Cliente cliente, Model model) {
        Cliente nuevoCliente = clienteService.registrarCliente(cliente);
        return "formularioLogin";
    }
    
    
    
    @GetMapping("/login")
    public String mostrarFormularioLogin(Model model, @RequestParam(name = "carrito", required = false) Boolean fromCarrito) {
        model.addAttribute("cliente", new Cliente());
        if (fromCarrito != null && fromCarrito) {
            model.addAttribute("fromCarrito", true);
        }
        return "formularioLogin";
        
    }
    @PostMapping("/login")
    public String iniciarSesion(@Valid @ModelAttribute Cliente cliente, BindingResult bindingResult, Model model,
            @SessionAttribute(value = "carrito", required = false) Carrito carrito) {
        if (bindingResult.hasErrors()) {
            return "formularioLogin";
        }
        Cliente autenticadoCliente = clienteService.iniciarSesion(cliente.getCorreo(), cliente.getPassword());
        if (autenticadoCliente != null) {
            if (carrito != null) {
                model.addAttribute("autenticadoCliente", autenticadoCliente);
                return "redirect:/pagoDetails";
            } else {
                return "redirect:/productos/index";
            }
        } else {
            model.addAttribute("error", "Credenciales incorrectas");
            return "formularioLogin";
        }
    }
    @GetMapping("/pagoDetails")
    public String mostrarDetallePago(Model model) {
    	
        return "pagoDetails"; 
    }
    
    
}
