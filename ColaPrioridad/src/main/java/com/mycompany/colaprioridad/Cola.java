
package com.mycompany.colaprioridad;

import java.util.ArrayList;

public class Cola<T> {
    private ArrayList<T> cola;

	public Cola() {
		this.cola = new ArrayList<>();
	}


	public boolean vacia() {
		return cola.isEmpty();
	}
        

	public int numElementos() {
		return cola.size();
	}
        
	public T sacarElemen() {
		T elemento;
		if (this.vacia()) {
			elemento = null;
		} else {
			elemento = cola.get(0);
			cola.remove(0);
		}
		return elemento;
	}
        
	public void agregaElemen(T elemento) {
		cola.add(elemento);
	}


    @Override
    public String toString() {
        return "Cola: " + this.cola + " sigue en ";
    }
	
}
