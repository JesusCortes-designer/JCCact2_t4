package com.prograweb.spring.app1.springboot_aplicacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    @GetMapping(value = "/", produces = "text/html; charset=UTF-8")
    public String inicio() {
        return """
            <html>
            <head><meta charset="UTF-8"><title>JCCact2_t4</title></head>
            <body>
                <h1>Proyecto JCCact2_t4</h1>
                <p>Jesús Cortés Cruz - Instituto Tecnológico de Oaxaca - Programación Web</p>
                <h2>Vistas</h2>
                <ul>
                    <li><a href="/mvc/lista">/mvc/lista</a></li>
                    <li><a href="/mvc/detalle/1">/mvc/detalle/1</a></li>
                    <li><a href="/mvc/formulario">/mvc/formulario</a></li>
                    <li><a href="/api/detalles_info">/api/detalles_info</a></li>
                </ul>
                <h2>API</h2>
                <ul>
                    <li><a href="/api/detalles_info2">/api/detalles_info2</a></li>
                    <li><a href="/api/parametros/detalle?informacion=Hola">/api/parametros/detalle?informacion=Hola</a></li>
                    <li><a href="/api/path/detalle/5">/api/path/detalle/5</a></li>
                    <li>POST /api/empleados (probar con Postman)</li>
                </ul>
            </body>
            </html>
            """;
    }
}