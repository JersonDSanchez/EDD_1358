
package com.mycompany.nominaadt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NominaADT {

    public static void main(String[] args) {
        
        ArregloADT nomina = new ArregloADT(14);
        try {
			BufferedReader br = new BufferedReader(new FileReader("junio.dat"));
                        br.readLine();
			for (int i = 0; i < 14; i++) {			
				String[] tmp = br.readLine().split(",");			
				Trabajador trabTempo = new Trabajador(Integer.parseInt(tmp[0]), tmp[1], tmp[2], tmp[3], Integer.parseInt(tmp[4]), Integer.parseInt(tmp[5]),(tmp[6]));
				nomina.setElemento(i, trabTempo);
			}
                        
                        //Listamos los sueldos
                        for (int i = 0; i < nomina.getLongitud(); i++) {
				Trabajador emp = (Trabajador) nomina.getElemento(i);
				System.out.println("Numero del trabajador: " + emp.getNumTrabajador() + " Sueldo: " + emp.calcSueldo());

			}
                        
                        //Ahora el trabajador con mas antiguedad
                        int mayor = 2023;
                        int indice = 0;
                        for (int i = 0; i < nomina.getLongitud(); i++){
                            Trabajador tmp = (Trabajador) nomina.getElemento(i);
                            if(tmp.getAnioIngreso()<mayor){
                                mayor = tmp.getAnioIngreso();
                                indice=i;
                            }
 
                        }
                        System.out.println("El Empleado con mayor antiguedad es: " + nomina.getElemento(indice));
                        
                        int menor = 0;
                        int indice2 = 0;
                        for (int i = 0; i < nomina.getLongitud(); i++){
                            Trabajador tmp = (Trabajador) nomina.getElemento(i);
                            if(tmp.getAnioIngreso()>menor){
                                menor= tmp.getAnioIngreso();
                                indice2=i;
                            }
 
                        }
                        System.out.println("El Empleado con menor antiguedad es: " + nomina.getElemento(indice2));

		} catch (IOException ex) {
            System.err.println(ex.getMessage());
		}
    }
}
