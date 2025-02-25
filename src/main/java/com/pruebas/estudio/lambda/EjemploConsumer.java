package com.pruebas.estudio.lambda;

import com.pruebas.estudio.Usuario;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {

//     EjemploConsumer ejemploConsumer = new EjemploConsumer();
//     Date fecha = new Date();
//     ejemploConsumer.consumidor(fecha);

        /*TODO: DATO Extra: el uso de la interface Consumer se ve reducido al momento de indicar que solo
        *  podemos incluir un parametro, pero como si queremos agregar mas debemos usar otra interface.*/
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(formato.format(fecha));
        };

        consumidor.accept(new Date());


        /*TODO: Bien para agregar mas de un parametro vamos a utilizar la interface BiConsumer*/

        BiConsumer<String, Integer> consumidor2 = (nombre, edad) -> System.out.println("Hola el es " + nombre + " y tiene " + edad + " años.");


        /*TODO: llamamos al metodo que acabamos de crear, igualmente con accept()*/

        consumidor2.accept("Luis", 18);

        /*TODO: ahora veamos como simplificar mucho mas el codigo*/

        Consumer<String> consumible = System.out::println;

        //TODO: Ejemplo con ArrayList
        List<String> nombres = Arrays.asList("Luis", "Angel", "Miguel", "Jose");
        nombres.forEach(System.out::println);

        /*TODO: Ejemplo con BiConsumer*/
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        Usuario usuario = new Usuario();
        asignarNombre.accept(usuario, "Luis");

        System.out.println("Nombre de usuario " + usuario.getNombre());

        Consumer<String> mensaje = Usuario::mostrarMensaje;
        mensaje.accept("Mensaje de metodo abstracto");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        Consumer<String> registro = a -> System.out.println("Hola, " + a);

        registro.accept(nombre);


    }

//    public void consumidor (Date fecha){
//        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println("Esta es la fecha: " + formato.format(fecha));
//    }
}
