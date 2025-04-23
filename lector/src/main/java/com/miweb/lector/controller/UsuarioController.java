package com.miweb.lector.controller;

import com.miweb.lector.model.Usuario;
import com.miweb.lector.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Mostrar el formulario
    @GetMapping("/registro")
    public String mostrarFormulario(Model model, @RequestParam(value = "exito", required = false) String exito) {
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("exito", exito != null); // devuelve true si viene el parámetro
        return "registro";
    }


    // Procesar el formulario
    @PostMapping("/registro")
    public String procesarFormulario(@ModelAttribute Usuario usuario) {
        usuarioRepository.save(usuario); // guarda en la base de datos
        return "redirect:/registro?exito"; // recarga la página con mensaje
    }
}
