
package com.mycompany.listadobleligada;

public class NodoDoble<T> {
    private T valor;
    private NodoDoble<T> Siguiente;
    private NodoDoble<T> Anterior;

    public NodoDoble() { 
    }
    
    public NodoDoble(T dato) {  
        this.valor = dato;
    }
    
    public NodoDoble(T dato, NodoDoble<T> Sig, NodoDoble<T> Ant) { 
        this.valor = dato;
        this.Siguiente = Sig;
        this.Anterior = Ant;
    }


    public NodoDoble<T> getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(NodoDoble<T> Sig) {
        this.Siguiente = Sig;
    }
    
    public NodoDoble<T> getAnterior(){
        return Anterior;
    }
    
    public void setAnterior(NodoDoble<T> Ant){
        this.Anterior = Ant;
    }

    public T getDato() {
        return valor;
    }

    public void setDato(T dato) {
        this.valor = dato;
    }

    @Override
    public String toString() {
        return "|" + valor + "|--> <-- ";
    }

    public String mostrar() {
        return "<--[Anterior= "+ this.getAnterior() + "]-->  <--[Dato= " + valor + "]-->  <--[Siguiente= " + this.getSiguiente() + "]-->";
    }
}

