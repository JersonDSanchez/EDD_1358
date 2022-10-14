package com.mycompany.laberinto;

public class Nodo<T> {

	private Nodo<T> sig;
	private T valor;
	
	public Nodo (T dat) {
		this.valor = dat;
	}
	
	public Nodo (T dat, Nodo<T> sig) {
		this.valor = dat;
		this.sig = sig;
	}

        public T getValor() {
		return valor;
	}

	public void setValor(T dato) {
		this.valor = dato;
	}

	public Nodo<T> getSiguiente() {
		return sig;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.sig = siguiente;
	}

	@Override
	public String toString() {
		return "| " + valor + " | -----> ";
	}
	
	
	
}
