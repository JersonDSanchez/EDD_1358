
package com.rk.juegodelav;

import java.util.ArrayList;

public class Arreglo2DADT<T> {

    private ArrayList<ArrayList<T>> array2DADT;
    private int renglones;
    private int columnas;

    public Arreglo2DADT(int filas, int columnas) {
        if (filas < 1 || columnas < 1) {
            throw new IndexOutOfBoundsException("La medidas no pueden ser menores de 1");
        }
        this.renglones = filas;
        this.columnas = columnas;
        array2DADT = new ArrayList<>();
        for (int i = 0; i < this.renglones; i++) {
            array2DADT.add(new ArrayList<>());
            for (int j = 0; j < this.columnas; j++) {
                array2DADT.get(i).add(null);
            }
        }
    }

    public int getFilas() {
        return renglones;
    }

    public int getColumnas() {
        return columnas;
    }

    public T getElemento(int fila, int columna) {
        return array2DADT.get(fila).get(columna);
    }

    public void setElemento(int fila, int columna, T valor) {
        array2DADT.get(fila).set(columna, valor);

    }

    public void limpiar(T valor) {
        for (int i = 0; i < renglones; i++) {
            for (int j = 0; j < columnas; j++) {
                array2DADT.get(i).set(j, valor);
            }
        }
    }

    @Override
    public String toString() {
        String estado = "\t\t--Estado de la tabla--";
        estado += "\nFilas: " + this.renglones + "\nColumnas: " + this.columnas + "\n";
        for (ArrayList<T> item : array2DADT) {
            if (item != null) {
                estado += item + "\n";
            }
        }
        return estado;
    }
}
