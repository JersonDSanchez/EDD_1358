
package com.mycompany.listadobleligada;

public class DobleLigada<T> {
    NodoDoble<T> head;
    int tamanio;

    public DobleLigada() {
        this.head = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return this.head == null;
    }

    public int getTamanio() {
        NodoDoble<T> nuevo = this.head;
        int tam=0;
        while (nuevo.getSiguiente() != null) {
                nuevo = nuevo.getSiguiente();
                
                tam=tam+1;
                
            }
        return tamanio=tam+1;
    }

    
    public void agregarAlInicio(T valor) {
         NodoDoble<T> nuevo = new NodoDoble(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
        } else {
           nuevo.setSiguiente(this.head);
           head.setAnterior(nuevo);
           this.head=nuevo;
           
           
        }

    }
    public void agregarAlFinal(T valor) {
        NodoDoble<T> nuevo = new NodoDoble(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
        } else {
            NodoDoble<T> aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
                nuevo.setAnterior(aux);
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            aux = null;
            nuevo = null;
        }
    }


    public void agregarDespuesDe(int posicion, T valor) {
        NodoDoble<T> nuevo = new NodoDoble(valor);
        NodoDoble<T> aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        aux.getSiguiente().setAnterior(nuevo);
        aux.setSiguiente(nuevo);
    }
   

    public void eliminarElPrimero() {
        
        
        if (this.estaVacia()) {
        } else {
          NodoDoble<T> nuevo = head.getSiguiente();
          head=nuevo;
          head.setAnterior(null);
           
           
        }

        
    }

    public void eliminarElFinal() {
        NodoDoble<T> nuevo = this.head;
        int tam=0;
        while (nuevo.getSiguiente() != null) {
                nuevo = nuevo.getSiguiente();
               
                tam=tam+1;
                
            }
       NodoDoble<T> aux = this.head;
        for (int contador = 1; contador <= tam-1 ; contador++) {
            aux = aux.getSiguiente();            
        }
        
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        aux.setAnterior(aux);   

    }
    
    public void eliminarPos(int posicion) {
        
         NodoDoble<T> aux = this.head;
        for (int contador = 1; contador <= posicion-1 ; contador++) {
            aux = aux.getSiguiente();            
        }
        
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        aux.setAnterior(aux);
              

    }


    public int buscarValor(T valor) {
         NodoDoble<T> nuevo = this.head;
        int posicion = 1;
        while (nuevo.getSiguiente() != null) {
            
            
             if(nuevo.getDato()!=valor){
                  posicion+=1;
                  nuevo = nuevo.getSiguiente();
             }else {
                 break;
             }
                
            }
        return posicion;
    }

    public void actualizarValor(T antiguo, T nuevo) {
        
          NodoDoble<T> aux = this.head;
        
        while (aux.getSiguiente() != null) {
            
            if(aux.getDato()==antiguo) {
                aux.setDato(nuevo);
                 break;
             } if(aux.getDato()!=antiguo){
                 
                  aux = aux.getSiguiente();
                                   
             } if(aux.getDato()==antiguo) {
                aux.setDato(nuevo);
                 break;
             }
            
        }
        
    }

    public void transversal() {
        NodoDoble nodo_actual = this.head;
        while (nodo_actual != null) {
            System.out.print(nodo_actual);
            nodo_actual = nodo_actual.getSiguiente();
        }
        System.out.println("");
    }
    
    
}
