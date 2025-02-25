package com.pruebas.estudio;


public class TareaFunctional {
    public static void main(String[] args) {

        Clean limpiar = frase ->
                frase.replace(",", "")
                .replace(" ", "")
                        .replace("¿", "")
                        .replace("?", "")
                .toUpperCase();

        String palabra = limpiar.formatear("Hola, ¿como estas?");
        System.out.println(palabra);
    }
}
