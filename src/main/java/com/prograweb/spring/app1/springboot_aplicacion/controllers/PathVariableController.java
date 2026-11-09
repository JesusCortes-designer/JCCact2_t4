package com.prograweb.spring.app1.springboot_aplicacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/path")
public class PathVariableController {

    @GetMapping("/detalle/{id}")
    public ParametroDTO detalle(@PathVariable("id") int id) {
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion("El id recibido es: " + id);
        return parametro1;
    }
}