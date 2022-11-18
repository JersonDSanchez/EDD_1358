
package com.mycompany.tablashash;

import java.util.ArrayList;

public class ArrayADT<T> {
            int tamanio;
            ArrayList<T> tabla;

	    public ArrayADT(int tam) {
	        this.tamanio = tam;
	        tabla = new ArrayList(this.tamanio);
	        for (int i = 0; i < this.tamanio; i++) {
	            this.tabla.add(null);
	        }
	    }

	    public T getElemento(int indice) {
	        if (comprobacion(indice)) {
	            return this.tabla.get(indice);
	        } else {
	            System.out.println("Fuera del rango");
	        }
	        return null;
	    }

	    private boolean comprobacion(int indice) {
	        return indice >= 0 && indice < this.tamanio;
	    }

	    public void setElemento(int indice, T dato) {
	        if (comprobacion(indice)) {
	            this.tabla.set(indice, dato);
	        } else {
	            System.out.println("Fuera del rango");
	        }
	    }

	    public int getLongitud() {
	        return this.tamanio;
	    }

	    public void limpiar(T dat) {
	        for (int i = 0; i < this.tamanio; i++) {
	            this.tabla.set(i, dat);
	        }
	    }
	    
	    public String toString(){
	        String estado = "Espacios Disponibles: "+this.tamanio+"\n";
	        for (T dat : tabla) {
	            if(dat != null){
	                estado += dat.toString()+"\n";
	            }
	        }
	        return estado;
	    }
}
