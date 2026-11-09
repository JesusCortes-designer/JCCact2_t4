package com.prograweb.spring.app1.springboot_aplicacion.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController 
@RequestMapping("/api/parametros")

public class RquestParamControllers {
    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam  (required = false, defaultValue = "Hola a todos") String informacion){
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(informacion);
        return parametro1;
    }
    
}
