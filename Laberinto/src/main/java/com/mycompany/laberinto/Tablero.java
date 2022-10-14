
package com.mycompany.laberinto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tablero {
    private Arreglo2D tablero;
	private Pila recorridoJugador = new Pila();
	private int[] entra = new int[2], sale = new int[2];

	public Tablero(String ruta) {
		try {
			BufferedReader lectura = new BufferedReader(new FileReader(ruta));
			int col, ren;

			col = Integer.parseInt(lectura.readLine());
			ren = Integer.parseInt(lectura.readLine());

			tablero = new Arreglo2D(ren, col);

			for (int r = 0; r < ren; r++) {
				String linea = lectura.readLine();
				String[] comas = linea.split(",");

				for (int c = 0; c < col; c++) {
					String caracterActual = comas[c];
					if (caracterActual.equals("0")) {
						tablero.setElemento(r, c, false);
					} else if (caracterActual.equals("1")) {
						tablero.setElemento(r, c, true);
					} else if (caracterActual.equals("E")) {
						tablero.setElemento(r, c, true);
						entra[0] = r;
						entra[1] = c;
					} else if (caracterActual.equals("S")) {
						tablero.setElemento(r, c, true);
						sale[0] = r;
						sale[1] = c;
					}
				}
			}

		} catch (FileNotFoundException ex) {
			System.out.println("Error en la lectura del archivo");
		} catch (IOException ex) {
		}

	}
	
        private int[] sigPaso(int[] coordAct, int[] coordAnt) {
		boolean pos = false;
		int renglonY = coordAct[0];
		int columnaX = coordAct[1];
		int[] coordsNuevas = null;
		boolean[] direccion = new boolean[4];

		direccion = ignorarCeros(renglonY, columnaX);
		for (int cont = 0; cont <= 4; cont++) {
			if (cont < 4) {
				if (direccion[cont]) {
					coordsNuevas = instrucciones(renglonY, columnaX, cont);
					pos = (boolean) tablero.getElemento(coordsNuevas[0], coordsNuevas[1]);
					if (pos && !this.coords(coordsNuevas, coordAnt)) {
						break;
					}
				} else {
					continue;
				}
			} else {
				coordsNuevas[0] = -1;
				coordsNuevas[1] = -1;
			}
		}

		return coordsNuevas;
	}
        
        	
	public void seguirCamino() {
		int[] posActual = entra;
		int[] fuera = { -1, -1 };
		int[] posAnterior = posActual;
		boolean aux = true;

		recorridoJugador.push(posActual);

		do {

			int[] nuevaPosicion = sigPaso(posActual, posAnterior);
			posAnterior = posActual;
			posActual = nuevaPosicion;

			if (coords(posActual, sale)) {
				recorridoJugador.push(posActual);
				aux = false;
			} else {
				if (coords(posActual, fuera)) {

					int[] borrar = (int[]) recorridoJugador.pop();
					tablero.setElemento(borrar[0], borrar[1], false);
					posActual = (int[]) recorridoJugador.pop();
					posAnterior = (int[]) recorridoJugador.peek();
					recorridoJugador.push(posActual);

					if (coords(borrar, entra)) {
						aux = false;
						recorridoJugador = null;
					}
				} else {
					recorridoJugador.push(posActual);
				}
			}
		} while (aux);
	}
        
	public int[] instrucciones(int fila, int columna, int paso) {
		int[] coords = new int[2];

		if (paso == 0) {
			coords[0] = fila;
			coords[1] = columna - 1;
		} else {
			if (paso == 1) {
				coords[0] = fila - 1;
				coords[1] = columna;
			} else {
				if (paso == 2) {
					coords[0] = fila;
					coords[1] = columna + 1;
				} else {
					if (paso == 3) {
						coords[0] = fila + 1;
						coords[1] = columna;
					}
				}
			}
		}

		return coords;
	}
	
	public boolean[] ignorarCeros(int filas, int columnas) {
		boolean[] direccion = { true, true, true, true };

		if (filas == 0) {
			direccion[1] = false;
		} else {
			if (filas == tablero.getFilas() - 1)
				;
			direccion[3] = false;
		}

		if (columnas == 0) {
			direccion[0] = false;
		} else {
			if (columnas == tablero.getColumnas() - 1) {
				direccion[2] = false;
			}
		}

		return direccion;
	}

	public void solucion() {
		if (recorridoJugador == null) {
			System.out.println("El Laberinto NO TIENE SALIDA");
		} else {
			System.out.printf("LAS COORDENADAS PARA SALIR DEL LABERINTO SON: \n", recorridoJugador.getLongi());
			Pila pilaAux = new Pila();
			while (recorridoJugador.getLongi() != 0) {
				int[] cord = (int[]) recorridoJugador.pop();
				pilaAux.push(cord);

				System.out.println("[ " + cord[0] + " ]" + "[ " + cord[1] + " ]");
			}

			recorridoJugador = pilaAux;
		}
	}

	private boolean coords(int[] coordsNuevas, int[] coordAnterior) {
		return (coordsNuevas[0] == coordAnterior[0]) && (coordsNuevas[1] == coordAnterior[1]);
	}
}
