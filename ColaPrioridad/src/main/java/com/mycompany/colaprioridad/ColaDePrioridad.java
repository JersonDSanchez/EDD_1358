package com.mycompany.colaprioridad;

public class ColaDePrioridad<T> {
    private Cola[] cola;
	private int numElemen, numNivelesPrioridad;
	
	public ColaDePrioridad(int prioridadNiveles) {
		this.numElemen = 0;
		this.numNivelesPrioridad = prioridadNiveles;
		this.cola = new Cola[prioridadNiveles];
		for (int i = 0; i < prioridadNiveles; i++) {
			cola[i] = new Cola<>();
		}
	}
		
	public int numElemen() {
		return numElemen;
	}
        
	public boolean vacio() {
		return numElemen == 0;
	}

	
	public T sacarElemen() {
		boolean aux = true;
		T elemento = null;;
		
		for (int i = 0; aux && numElemen > 0; i++) {
			if (!cola[i].vacia()) {
				elemento = (T) cola[i].sacarElemen();
				aux = false;
			}
		}
		numElemen--;
		return elemento;
	}
        
	public T agregarElemen (int prioridad, T elemento) {
		if (prioridad < numNivelesPrioridad) {
			cola[prioridad].agregaElemen(elemento);
			numElemen++;
		} else {
			System.out.println("No hay niveles con tu elemento");
		}
		return elemento;
	}
	
		
	private String elementos() {
		String string = "";
		for (int i = 1; i < numNivelesPrioridad; i++) {
			string += cola[i];
		}
		return string;
	}
        
	public String toString() {
		return "" + elementos() + " La cola tiene " + (numNivelesPrioridad - 1) + " niveles de prioridad";
	}

}
