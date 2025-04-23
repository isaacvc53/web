package com.miweb.lector.controller;

import com.miweb.lector.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String mostrarLogin(Model model) {
        model.addAttribute("usuario", new Usuario()); // ✅ añade el objeto al modelo
        return "login";
    }
}
