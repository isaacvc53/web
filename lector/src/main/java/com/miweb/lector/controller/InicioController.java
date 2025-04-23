package com.miweb.lector.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("/")
    public String mostrarInicio(Model model) {
        model.addAttribute("titulo", "Bienvenido a la Biblioteca Digital");
        return "inicio"; // Renderiza "inicio.html" desde templates
    }
}
