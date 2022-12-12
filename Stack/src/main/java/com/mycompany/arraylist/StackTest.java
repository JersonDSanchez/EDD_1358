
package com.mycompany.arraylist;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
          Stack<String> pila = new Stack<String>();
          
                //Agregamos elementos con push
          
                pila.push("Shinomiya");
		pila.push("Hayasaka");
		pila.push("Kohaku");
		pila.push("Shinon");
		pila.push("Mikasa");
                System.out.print(pila);
                System.out.print("\n||||||||||||||||||||||||||||||||||");
                
                //La lista ahora está vacía? (comprobamos con isEmpty)
                System.out.println("\nSu pila esta vacia? " + pila.isEmpty());
                System.out.print("||||||||||||||||||||||||||||||||||");
                
                //Mostramos el último elemento de nuestra pila
                System.out.println("\nLa ultima waifu de su pila es: " + pila.peek());
                System.out.print("||||||||||||||||||||||||||||||||||");
                
                //Ahora después de mostrarse eliminamos el último elemento con pop
                pila.pop();
		System.out.println("\n"+pila);
		System.out.println("||||||||||||||||||||||||||||||||||");
                
                //Agregamos más elementos para luego medir el tamaño de la pila
                pila.push("Ai");
		pila.push("Suika");
		pila.push("Sachi");
                System.out.println(pila);
                System.out.println("||||||||||||||||||||||||||||||||||");
                System.out.println("Nuestro stack de waifus tiene un numero de " + pila.size());
		System.out.println("||||||||||||||||||||||||||||||||||");
                
                //Eliminaremos toda la pila con clear y luego volveremos a comprobar si está vacía
                System.out.println("Pila actual: " + pila);
                pila.clear();
                System.out.println("||||||||||||||||||||||||||||||||||");
                System.out.println("Pila actual: " + pila);
                System.out.println("||||||||||||||||||||||||||||||||||");
                System.out.println("Su pila esta vacia? " + pila.isEmpty());             
                
    }
}
