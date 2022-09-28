
package com.mycompany.listadobleligada;

public class PruebaDobleLigada {
    public static void main(String[] args) {
        DobleLigada probar = new DobleLigada();
         System.out.println("Agregamos nuestro valor inicial");
        probar.agregarAlInicio(1);
        probar.transversal();
         System.out.println("Agregamos los demas valores");
        probar.agregarAlFinal(4);
        probar.agregarAlFinal(17);
        probar.agregarAlFinal(22);
        probar.agregarAlFinal(95);
        probar.agregarAlFinal(101);
        probar.agregarAlFinal(2022);
        probar.transversal();
         System.out.println("El tamanio que tenemos es de");
         System.out.println(probar.getTamanio());
         System.out.println("Metemos un nuevo valor que sera 99");
        probar.agregarDespuesDe(4, 99);
        probar.transversal();
         System.out.println("Ahora al inicio meteremos un valor completamente nuevo");
        probar.agregarAlInicio(22);
        probar.transversal();
         System.out.println("Ahora eliminaremos el valor que esta en la posicion 7 que es 95");
        probar.eliminarPos(6);
        probar.transversal();
         System.out.println("Eliminaremos el inicio que es el 22");
        probar.eliminarElPrimero();
        probar.transversal();
         System.out.println("Y eliminaremos tambien el final que es el 2022");
        probar.eliminarElFinal();
        probar.transversal();
         System.out.println("Buscaremos el 22");
         System.out.println("El 22 esta en la posicion: " + (probar.buscarValor(22)));
         System.out.println("Actualizaremos el numero 101 por 202");
        probar.actualizarValor(101, 99);
        probar.transversal();
    }
    
}
