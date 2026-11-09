package com.prograweb.spring.app1.springboot_aplicacion.controllers;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prograweb.spring.app1.springboot_aplicacion.models.Empleados;
import com.prograweb.spring.app1.springboot_aplicacion.models.DTO.ClaseDTO;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")


public class EjemploRestController {

    @RequestMapping(path ="/detalles_info2")
    
      public ClaseDTO detalles_info() {
        ClaseDTO usuario1= new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("PrograWeb");
        return usuario1;

    }
}