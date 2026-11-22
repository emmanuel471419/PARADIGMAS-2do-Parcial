package com.ejemplo.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.ejemplo.demo.models.Empleados;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {
        Empleados empleado1 = new Empleados("Juan", "Rodriguez", "Calle 1 No 2", "Gerente", 35, 123456789, 1);
        model.addAttribute("empleado", empleado1);
        return "detalles_info";
    }
}