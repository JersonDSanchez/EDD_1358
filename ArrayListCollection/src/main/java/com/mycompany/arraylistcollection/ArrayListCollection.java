
package com.mycompany.arraylistcollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {

    public static void main(String[] args) {
                List futbolista = new ArrayList();
                //Agregamos elementos a la lista
                futbolista.add("Messi");
		futbolista.add("Cristiano");
		futbolista.add("Mbappe");
		futbolista.add("Neymar");
		futbolista.add("Hazard");
		futbolista.add("Vinicius");
                futbolista.add("Kane");
                futbolista.add("Lukaku");
                futbolista.add("Ochoa");
		System.out.println(futbolista);		
		System.out.println("||||||||||||||||||||||||||||||||");
                
                //Comprobamos si nuestra lista está vacía
                System.out.println("Su lista esta vacia? " + futbolista.isEmpty());
                System.out.println("||||||||||||||||||||||||||||||||");
                
                //Eliminamos elementos en una posicion especfica
                futbolista.remove(1);
                futbolista.remove(3);
		System.out.println(futbolista);
                System.out.println("||||||||||||||||||||||||||||||||");
                
                //Verificamos la existencia de algunos elementos
                System.out.println("Este futbolista sigue en el mundial? " + futbolista.contains("Gakpo"));
		System.out.println("Este futbolista sigue en el mundial? " + futbolista.contains("Messi"));
                 System.out.println("||||||||||||||||||||||||||||||||");
                 
                //Buscamos elementos en la lista
                System.out.println("Estos futbolistas fueron al mundial de Qatar 2022: ");
                System.out.println(futbolista.get(1));
		System.out.println(futbolista.get(2));
		System.out.println(futbolista.get(6));
                 System.out.println("||||||||||||||||||||||||||||||||");
                 
                //Medimos el tamaño de la lista
                System.out.println("Nuestra lista tiene " + futbolista.size() + " elementos");
                 System.out.println("||||||||||||||||||||||||||||||||");
                 
                 //Eliminamos todos los elementos y luego comprobaremos si esta vacía
                System.out.println("Lista actual: " + futbolista);
                futbolista.clear();
                System.out.println("||||||||||||||||||||||||||||||||||");
                System.out.println("Lista actual: " + futbolista);
                System.out.println("||||||||||||||||||||||||||||||||||");
                System.out.println("Su lista esta vacia? " + futbolista.isEmpty()); 
    }
}
