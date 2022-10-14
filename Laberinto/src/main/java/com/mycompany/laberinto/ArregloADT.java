package com.mycompany.laberinto;

import java.util.ArrayList;

public class ArregloADT<T> {

	private int tam;
	private ArrayList<T> lista = new ArrayList<T>();

	public ArregloADT(int tamanio) {
		this.tam = tamanio;
		for (int i = 0; i < tamanio; i++) {
			lista.add((T) "");
		}
	}

	public T getElemento(int indice) {

		if (comprobarIndice(indice)) {
			return lista.get(indice);
		}
		return null;
	}

	public void setElemento(T dato, int indice) {
		if (comprobarIndice(indice)) {
			lista.set(indice, dato);
		}

	}

	public int getLongitud() {

		return lista.size();
	}

	public void limpiar(T dato) {
		int cont = 0;
		for (T i : lista) {
			lista.set(cont, dato);
			cont++;
		}
	}

	@Override
	public String toString() {
		return String.format("%s\n", this.lista);
	}

	private boolean comprobarIndice(int indice) {
		if (indice >= 0 && indice < tam) {
			return true;
		} else {
			return false;
		}
	}
}
