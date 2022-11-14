
package com.mycompany.colaprioridad;

public class PruebaColaPriori {

    public static void main(String[] args) {
        ColaDePrioridad cola = new ColaDePrioridad<>(6);
		
                cola.agregarElemen(4, "Maestre");                
		cola.agregarElemen(2, "Ninos");
                cola.agregarElemen(4, "Mecanico");
		cola.agregarElemen(3, "Hombres");
                cola.agregarElemen(4, "Vigia");
                cola.agregarElemen(5, "Capitan");
                cola.agregarElemen(4, "Timonel");
                cola.agregarElemen(3, "Mujeres");
                cola.agregarElemen(2, "3ra Edad");
		cola.agregarElemen(1, "Ninas");	
		

		System.out.println(cola);
    }
}
