package com.ejemplo.demo.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    public Map<String, Object> detallesInfo2() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("titulo", "Servidor en línea");
        respuesta.put("servidor", "InformaticConfig");
        respuesta.put("ip", "192.168.1.1");
        return respuesta;
    }
}