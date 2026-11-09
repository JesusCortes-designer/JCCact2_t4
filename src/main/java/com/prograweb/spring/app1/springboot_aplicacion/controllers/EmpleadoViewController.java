package com.prograweb.spring.app1.springboot_aplicacion.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prograweb.spring.app1.springboot_aplicacion.models.DTO.EmpleadoDTO;

@Controller
@RequestMapping("/mvc")
public class EmpleadoViewController {

    @Value("${app.proyecto}")
    private String proyecto;

    @Value("${app.autor}")
    private String autor;

    private final List<EmpleadoDTO> empleados = new ArrayList<>(List.of(
            new EmpleadoDTO(1, "María", "Perez", "Secretaria", 20),
            new EmpleadoDTO(2, "Juan", "Rodriguez", "Gerente", 35),
            new EmpleadoDTO(3, "Luis", "Martínez", "Contador", 28)));

    @GetMapping("/lista")
    public String lista(Model model) {
        model.addAttribute("empleados", empleados);
        model.addAttribute("proyecto", proyecto);
        model.addAttribute("autor", autor);
        return "lista";
    }

    @GetMapping("/detalle/{id}")
    public String detalle(@PathVariable("id") int id, Model model) {
        EmpleadoDTO encontrado = null;
        for (EmpleadoDTO e : empleados) {
            if (e.getId() == id) {
                encontrado = e;
            }
        }
        model.addAttribute("empleado", encontrado);
        return "detalle";
    }

    @GetMapping("/formulario")
    public String formulario(Model model) {
        model.addAttribute("empleado", new EmpleadoDTO());
        return "formulario";
    }

    @PostMapping("/formulario")
    public String procesar(@ModelAttribute("empleado") EmpleadoDTO empleado, Model model) {
        empleado.setId(empleados.size() + 1);
        empleados.add(empleado);
        model.addAttribute("empleado", empleado);
        return "resultado";
    }
}