
package com.mycompany.queue;


public class Main {

    public static void main(String[] args) {
        Cola nuevaCola = new Cola();
        
        
        nuevaCola.agregaElemen(22);
        nuevaCola.agregaElemen(23);
        nuevaCola.agregaElemen(4);
        nuevaCola.agregaElemen(45);
        nuevaCola.agregaElemen(10);
        nuevaCola.agregaElemen(34);
        nuevaCola.agregaElemen(12);
        
        System.out.println(nuevaCola);       
        
        System.out.println(nuevaCola.vacia());        
        System.out.println(nuevaCola.numElementos());
        nuevaCola.sacarElemen();
        System.out.println(nuevaCola.numElementos());
    }
    }
