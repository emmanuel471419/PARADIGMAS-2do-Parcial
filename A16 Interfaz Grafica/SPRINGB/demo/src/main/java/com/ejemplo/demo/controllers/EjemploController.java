package com.ejemplo.demo.controllers;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.ejemplo.demo.models.Empleados;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {
        Empleados empleado1 = new Empleados("Juan", "Rodriguez", "Calle Primera No 1", "Gerente", 35, 123456789, 1);
        model.addAttribute("empleado", empleado1);
        return "detalles_info";
    }

    @ModelAttribute("empleados")
    public List<Empleados> listaEmpleados() {
        return Arrays.asList(
            new Empleados("María", "Pérez", "Calle Segunda No 2", "Secretaria", 20, 123456789, 2),
            new Empleados("Carlos", "López", "Av. Central 45", "Desarrollador", 28, 551234567, 3),
            new Empleados("Ana", "Martínez", "Calle Norte 12", "Analista", 26, 559876543, 4),
            new Empleados("Luis", "García", "Blvd. Sur 88", "Contador", 32, 554433221, 5)
        );
    }
}