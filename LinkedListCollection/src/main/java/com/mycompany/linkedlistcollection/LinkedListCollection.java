
package com.mycompany.linkedlistcollection;

import java.util.LinkedList;

public class LinkedListCollection {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<Integer>();
        
                //Agregamos elementos a nuestra lista con add
                lista.add(60);
		lista.add(22);
		lista.add(87);
		lista.add(777);
		lista.add(1);
                lista.add(18);
                lista.add(97);
                lista.add(47);
		System.out.println(lista);
		System.out.println("||||||||||||||||||||||||||||||||");
                
                //Comprobamos si nuestra lista está vacía
                System.out.println("Su lista esta vacia? " + lista.isEmpty());
		System.out.println("||||||||||||||||||||||||||||||||");
                
                //Agregaremos un elemento al principio y al final (Utilizamos addFirst y addLast
                lista.addFirst(5);
                lista.addLast(100);
                System.out.println(lista);
                System.out.println("||||||||||||||||||||||||||||||||");
                
                //Cambiaremos elementos con set
                lista.set(2, 888);
		lista.set(3, 666);
		lista.set(0, 111);
		System.out.println(lista);
                System.out.println("||||||||||||||||||||||||||||||||");
                
                //Agregamos un elemento en una posicion en especifico
                lista.add(6, 444);
		System.out.println(lista);
                System.out.println("||||||||||||||||||||||||||||||||");
                
                //Eliminaremos el primer elemento, el último elemento y el elemento de una posicion en especifico
                lista.removeFirst();
                lista.removeLast();
                lista.remove(2);
                System.out.println(lista);
                System.out.println("||||||||||||||||||||||||||||||||");
                
                //Medimos el tamaño de nuestra lista con size
                System.out.println("La lista tiene un tamanio de " + lista.size() + " elementos");
                System.out.println(lista);
                System.out.println("||||||||||||||||||||||||||||||||");
                
                //Eliminamos todos los elementos y luego comprobaremos si esta vacía
                System.out.println("Lista actual: " + lista);
                lista.clear();
                System.out.println("||||||||||||||||||||||||||||||||||");
                System.out.println("Lista actual: " + lista);
                System.out.println("||||||||||||||||||||||||||||||||||");
                System.out.println("Su pila esta vacia? " + lista.isEmpty());  
    }
}
