package com.pruebas.estudio;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        /*TODO: Ejercicios con Consumer y las operaciones lambda*/

        /*todo 1️⃣ Ejercicio: Imprimir una lista con forEach y ::
           Tienes una lista de nombres y quieres imprimir cada uno usando una referencia a métoudo.*/

        List<String> animales = Arrays.asList("Dog", "Cat", "Cow", "Horse", "Lion", "Moose", "Tiger");

        animales.forEach(System.out::println);

        /*TODO: 3️⃣ Ejercicio: Referencia a un método de instancia en una clase
           Tienes una clase Persona con un métoudo saludar(), y quieres usar una referencia
           a métoudo para llamarlo en una lista de objetos.*/

        List<Usuario> personas = Arrays.asList(
                new Usuario("Luis"),
                new Usuario("Marta"),
                new Usuario("Pedro")
        );

        personas.forEach(Usuario::saludar);

        personas.forEach(recorrer -> Usuario.mostrarMensaje(recorrer.getNombre()));


        BiConsumer<Integer, String> consumer = (edad, nombre) -> System.out.println("Hola soy:" + nombre + " edad: " + edad);

        consumer.accept(18, "Mario");

        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Mario");

        Usuario usuario = new Usuario();
        BiConsumer<Usuario, String> biConsumer = Usuario::setNombre;

        biConsumer.accept(usuario, "Nil");

        System.out.println("Nombre de usuario: " + usuario.getNombre());

        Supplier<Integer> metodoSupplier = () -> 10;

        System.out.println(metodoSupplier.get());

    }
}