
package com.mycompany.laberinto;

public class Pila<T> {
    private Nodo<T> top;
	private int longi;
	
	public Pila() {
		this.top = null;
		this.longi = 0;
	}
	
        	
	public void push(T valor) {
		Nodo nuevo = new Nodo<T>(valor, top);
		this.top = nuevo;
		this.longi++;
	}
	
	public T pop() {
		T aux;
		if (this.Vacio()) {
			return null;
		} else {
			aux = top.getValor();
			top = top.getSiguiente();
			this.longi--;
			return aux;
		}
	}
        
	public int getLongi() {
		return longi;
	}
	
	public boolean Vacio() {
		return top == null;
	}
	
	public T peek() {
		if (this.Vacio()) {
			return null;
		} else {
			return top.getValor();
		}
	}
	
	public void imprimir() {
		Nodo currNode = this.top;
		while (currNode != null) {
			System.out.print(currNode);
			currNode = currNode.getSiguiente();
		}
		System.out.println("");
	}
}
