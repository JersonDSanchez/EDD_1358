
package com.mycompany.stacktest;

public class Stack<T> {
    
    LSL_ADT pilla;
    
    public Stack() {
        this.pilla = new LSL_ADT();
    }

    public boolean estaVacia() {
        return this.pilla.estaVacia();
    }

    public int getRozmiar() {
        return this.pilla.getRozmiar();
    }

    public T pop() {
        Object NPOP = pilla.regresarFinal();
        this.pilla.eliminarElFinal();
        return (T)NPOP;
    }

    public T peek() {
        Object NPEEK = pilla.regresarFinal();
        return (T)NPEEK;
    }

    public void push(T valor) {
        this.pilla.agregarAlFinal(valor);
    }

    public void transversal() {
        this.pilla.transversalPila();
    }

    @Override
    public String toString() {
        return "Pilas_ADT{" + "pilla=" + pilla + '}';
    }
}
