package com.pruebas.estudio.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploSuplier {

    public static void main(String[] args) {
        /*TODO: Ejercicio 5: Crea un Supplier<Double>
           que devuelva un número aleatorio entre 0 y 1.*/

        Supplier<Double> aleatorio = () -> {
            Random aleatorios = new Random();
            Integer n = aleatorios.nextInt((2));
            return 2.6;
        };

        /*TODO: Ejercicio 6: Implementa un Supplier<List<String>>
           que retorne una lista con tres nombres predefinidos.*/

        Supplier<List<String>> nombre = () -> Arrays.asList("Luis", "Nil", "Mario");

        Consumer<String> n = System.out::println;

        nombre.get().forEach(n);

        /*TODO Simplificando mas el codigo :v*/

        nombre.get().forEach(System.out::println);
        
    }
}
