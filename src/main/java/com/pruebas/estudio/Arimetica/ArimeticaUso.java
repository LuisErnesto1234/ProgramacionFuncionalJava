package com.pruebas.estudio.Arimetica;

public class ArimeticaUso {

    public static void main(String[] args) {
        /*TODO ejemplos de operaciones basicas con lambdas*/

        Arimetica suma = Integer::sum;
        Arimetica resta = Integer::min;
        Arimetica multiplicacion = (a, b) -> a * b;

        System.out.println(suma.algebra(2, 5));
        System.out.println(resta.algebra(5, 2));
        System.out.println(multiplicacion.algebra(5, 5));
    }

}
