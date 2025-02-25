package com.pruebas.estudio.lambda;

import com.pruebas.estudio.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        Predicate<Integer> prueba = numero -> numero > 5;
        boolean resultado = prueba.test(6);
        System.out.println(resultado);

        /*TODO sobre esta interfaz podemos decir que basicamente le pasamos datos por parametros
        *  y luego la interfaz Predicate evalua si lo indicado dentro de la función es true o false
        * por ende devuelve siempre un booleano*/

        Usuario usuario1 = new Usuario("Lucho");
        Usuario usuario2 = new Usuario("Lucho");

//        BiPredicate<Usuario, Usuario> predicate = (a, b) -> a.getNombre().equals(b.getNombre());
//        boolean resultado1 = predicate.test(usuario1, usuario2);
//        System.out.println(resultado1);
//
//        Predicate<Integer> par = a -> a % 2 == 0;
//
//        boolean r = par.test(5);
//        System.out.print(r);

        /*TODO: Ejercicio 4: Crea un BiPredicate<String, Integer>
        todo que devuelva true si la longitud de la cadena es igual al número dado.*/
        BiPredicate<String, Integer> contador = (a, b) -> a.length() == b;

        boolean recu = contador.test("Hola", 6);
        System.out.println(recu);

    }

}
