
package com.rk.juegodelav;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Tablero t = new Tablero();
        System.out.println(t.getTablero());
        for(int i=0; i<11;i++){
            t.reglas();
            t.contarVecinos();
            System.out.println("Gen " + i + "\n" + t.getTablero());
        }
    }
    
}
