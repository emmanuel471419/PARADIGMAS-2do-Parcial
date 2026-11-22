package com.ejemplo.demo.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ejemplo.demo.models.Empleados;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    // Propiedades inyectadas desde application.properties (Lección 17)
    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.codigo}")
    private int codigo;

    @Value("${config.mensaje}")
    private String mensaje;

    @Value("${config.valores}")
    private String[] valores;

    // Lección 15: @PathVariable
    @GetMapping("/pagina1/{mensaje}")
    public ParametroDTO pagina1(@PathVariable String mensaje) {
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;
    }

    // Lección 16: @PostMapping + @RequestBody (probar con Postman)
    @PostMapping("/solicitud")
    public Empleados creaEmple(@RequestBody Empleados empleado1) {
        return empleado1;
    }

    // Lección 17: @Value
    @GetMapping("/valores")
    public Map<String, Object> values() {
        Map<String, Object> json = new HashMap<>();
        json.put("usuario", usuario);
        json.put("codigo", codigo);
        json.put("mensaje", mensaje);
        json.put("valores", valores);
        return json;
    }
}