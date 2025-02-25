package com.pruebas.estudio.lambda;

import com.pruebas.estudio.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class EjemploFunction {

    /*TODO ahora toca ver un poco mas sobre otra interfaz del API Stream de Java
    *  en este caso es sobre Function, y lo que haremos es ver como esta interfaz recibe un parameter
    * y del vuelve un dato o informacion que deseamos*/

    public static void main(String[] args) {

        Function<String, String> f1 = (nombre) -> "Hola me llamo: " + nombre;
        System.out.println(f1.apply("Pedro"));

        Function<String, String> f2 = String::toLowerCase;

        System.out.println(f2.apply("LUIS"));

        BiFunction<String, String, Integer> f3 = String::compareTo;
        int resultado = f3.apply("Luis", "Luis");
        System.out.println(resultado);

        /*TODO: Ejercicio 7: Implementa un Function<String, Integer>
           que reciba un texto y retorne su longitud.*/

        Function<String, Integer> longitud = String::length;
        System.out.println("La longitud de la cadena es: " + longitud.apply("Amigo"));

        /*TODO: Ejercicio 8: Crea un BiFunction<Integer, Integer, Integer>
           que reciba dos números y retorne su suma.*/
        Scanner sc = new Scanner(System.in);
        BiFunction<Integer, Integer, Integer> suma = Integer::sum;
        System.out.println("Ingrese el numero a sumar: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el numero dos a sumar: ");
        int n2 = sc.nextInt();

        Integer r = suma.apply(n1, n2);
        System.out.println("El resultado de la suma es: " + r);

        /*TODO: Ejercicio 9: Usa una referencia a un método de
           instancia para imprimir una lista de nombres en mayúsculas.*/

//        Consumer<String> nom = a -> System.out.println(a.toUpperCase());

        List<String> lista = Arrays.asList("Lucho", "Miguel", "Nil", "Sasi", "Claudio");

//        lista.forEach(s -> System.out.println(s.toUpperCase()));
        lista.forEach(EjemploFunction::imprimirEnMayusculas);

        /*TODO: Ejercicio 10: Usa una referencia a un constructor para crear
           una lista de ArrayList<String> vacíos */

        Supplier<ArrayList<String>> supplier = ArrayList::new;

        // Crear una lista que contendrá múltiples ArrayList vacíos
        List<ArrayList<String>> listaDeListas = new ArrayList<>();

        // Llenamos la lista con 5 ArrayList vacíos
        for (int i = 0; i < 5; i++) {
            listaDeListas.add(supplier.get());
        }

        // Imprimir la lista de listas
        System.out.println("Número de listas creadas: " + listaDeListas.size());
        System.out.println("¿Cada lista está vacía?: " + listaDeListas.stream().allMatch(List::isEmpty));

    }

    public static void imprimirEnMayusculas(String s) {
        System.out.println(s.toUpperCase());
    }
}
