package com.mycompany.laberinto;

public class Arreglo2D<T> {

	private ArregloADT filas;
	private ArregloADT columnas;
	private int filasTam, columnasTam;

	public Arreglo2D(int ren, int col) {

		filas = new ArregloADT(ren);
		columnas = new ArregloADT(col);
		this.filasTam = ren;
		this.columnasTam = col;

		for (int r = 0; r < filasTam; r++) {
			ArregloADT listaLlenado = new ArregloADT(columnasTam);
			for (int c = 0; c < columnasTam; c++) {
				listaLlenado.setElemento(r, c);
			}
			filas.setElemento(listaLlenado, r);
		}
	}

        public T getElemento(int r, int c) {
		if (comprobarLimite(r, c)) {
			ArregloADT cambioVariable = (ArregloADT) filas.getElemento(r);
			return (T) cambioVariable.getElemento(c);
		} else {
			return null;
		}

	}
        
        public void setElemento(int r, int c, T dato) {

		if (comprobarLimite(r, c)) {
			ArregloADT cambioVariable = (ArregloADT) filas.getElemento(r);
			cambioVariable.setElemento(dato, c);
			filas.setElemento(cambioVariable, r);
		}
	}
 
	public int getColumnas() {
		return this.columnasTam;
	}
        
	public int getFilas() {
		return this.filasTam;
	}
        
        public void limpiar(T t) {
		for (int r = 0; r < filasTam; r++) {
			for (int c = 0; c < columnasTam; c++) {
				columnas.setElemento(t, c);
			}
			filas.setElemento(columnas, r);
		}
	}

	@Override
	public String toString() {
		return filas.toString();
	}

	private boolean comprobarLimite(int r, int c) {
		return (r < this.filasTam && c < columnasTam);
	}
}
