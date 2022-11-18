
package com.mycompany.tablashash;

import java.util.ArrayList;

public class TablaHash<T> {
            int llave;
	    int tamanio;
	    T dato;
	    ArrayADT<T> Tabla;
	    ArrayList<T> Arreglo;


	    public TablaHash() {
	    }

	    public TablaHash(int tam) {
	        this.tamanio = tam;
	        Tabla = new ArrayADT(tam);
	    }
	   
	    public void add(int key, T dato){
	     int colocador = key%tamanio;
	     Tabla.setElemento(colocador, dato);
	    }

	    public T valueOf(int key){
	     int colocador = key%tamanio;   
	     return Tabla.getElemento(colocador) ; 
	    }
	 
	    public void remove(int key){
	     int colocador = key%tamanio; 
	     Tabla.limpiar(dato);
	    }

	    @Override
	    public String toString() {
	        return " "+Tabla+" "; 
	    }
}
