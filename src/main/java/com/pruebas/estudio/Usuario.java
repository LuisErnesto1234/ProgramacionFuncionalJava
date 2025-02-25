package com.pruebas.estudio;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    public Usuario() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
