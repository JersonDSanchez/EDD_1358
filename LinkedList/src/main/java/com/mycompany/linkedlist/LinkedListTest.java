
package com.mycompany.linkedlist;

public class LinkedListTest {

    public static void main(String[] args) {
         System.out.println("Test LinkedList");
        LinkedList <Integer> lista = new LinkedList();
        lista.agregarAlFinal(15);
        lista.transversal();
        lista.agregarAlFinal(8);
        lista.agregarAlFinal(22);
        lista.transversal();
        lista.agregarAlInicio(222);
        lista.transversal();
        lista.agregarDespuesDe(55, 1);
        lista.transversal();
        lista.eliminar(3);
        lista.transversal();
    }
}
