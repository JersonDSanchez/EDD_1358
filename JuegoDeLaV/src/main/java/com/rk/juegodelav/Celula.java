
package com.rk.juegodelav;

public class Celula {
    private boolean vida;
    private int numVecinosVivos, posRenglon, posColumna;

    public Celula(int posRenglon, int posColumna) {
        this.vida = false;
        this.numVecinosVivos = 0;
        this.posRenglon = posRenglon;
        this.posColumna = posColumna;
    }

    public boolean isVida() {
        return vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }

    public int getNumVecinosVivos() {
        return numVecinosVivos;
    }

    public void setNumVecinosVivos(int numVecinosVivos) {
        this.numVecinosVivos = numVecinosVivos;
    }

    public int getPosRenglon() {
        return posRenglon;
    }

    public void setPosRenglon(int posRenglon) {
        this.posRenglon = posRenglon;
    }

    public int getPosColumna() {
        return posColumna;
    }

    public void setPosColumna(int posColumna) {
        this.posColumna = posColumna;
    }

    @Override
    public String toString() {
        
       
        String cadena;
        if(vida){
            cadena = " V ";
        }else{
           cadena = " M ";
        }
        return cadena;
    }
    
}
