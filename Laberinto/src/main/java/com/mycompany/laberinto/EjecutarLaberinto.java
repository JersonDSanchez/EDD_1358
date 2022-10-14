
package com.mycompany.laberinto;

public class EjecutarLaberinto {

    public static void main(String[] args) {
        
        Tablero laberinto = new Tablero("C:\\Users\\jerda\\Documents\\NetBeansProjects\\Laberinto\\src\\main\\java\\com\\mycompany\\laberinto\\CaminoLaberinto.csv");
		
		laberinto.seguirCamino();
		laberinto.solucion();
	}
    }
