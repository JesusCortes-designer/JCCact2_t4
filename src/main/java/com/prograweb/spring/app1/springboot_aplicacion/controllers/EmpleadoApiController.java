package com.prograweb.spring.app1.springboot_aplicacion.controllers;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prograweb.spring.app1.springboot_aplicacion.models.DTO.EmpleadoDTO;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoApiController {

    @PostMapping
    public Map<String, Object> crear(@RequestBody EmpleadoDTO empleado) {
        Map<String, Object> respuesta = new LinkedHashMap<>();
        respuesta.put("mensaje", "Empleado recibido correctamente");
        respuesta.put("empleado", empleado);
        return respuesta;
    }
}