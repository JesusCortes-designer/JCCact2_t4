package com.prograweb.spring.app1.springboot_aplicacion.models.DTO;

public class EmpleadoDTO {
    private int id;
    private String nombre, apellido, puesto;
    private int edad;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(int id, String nombre, String apellido, String puesto, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.edad = edad;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}