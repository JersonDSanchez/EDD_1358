package com.mycompany.presenciaredes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PresenciaRedes {
    public static void main(String[] args) {
        String linea;
       
      ArrayList<String[]> guardar = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("presenciaredes.csv"));
            linea = br.readLine();
            while(linea != null) { 
                guardar.add(linea.split(","));
                linea = br.readLine();
            }
            String[][] tabla = new String[guardar.size()][19];
            
            for(int cnt=0;cnt<guardar.size();cnt++){
                String[] pase = guardar.get(cnt); 
                System.arraycopy(pase, 0, tabla[cnt], 0, 15);
            }
            
            for(int cnt=0;cnt<guardar.size();cnt++){
                 
                for(int cnt2=0; cnt2<15;cnt2++){
                    
                    System.out.print(tabla[cnt][cnt2] + "   "); 
                } 
                System.out.println(); 
                
            }     
                System.out.println("La diferencia de seguidores de Twitter de Enero a Junio es: ");
                System.out.println(Integer.parseInt(tabla[8][8])-Integer.parseInt(tabla[8][3]));
                System.out.println("El promedio de crecimiento de Facebook de Enero a Junio es: ");
                System.out.println(((Integer.parseInt(tabla[2][8]))+(Integer.parseInt(tabla[2][7]))+(Integer.parseInt(tabla[2][6]))+(Integer.parseInt(tabla[2][5]))+(Integer.parseInt(tabla[2][4]))+(Integer.parseInt(tabla[2][3])))/6);
                System.out.println("El promedio de crecimiento de Twitter de Enero a Junio es: ");
                System.out.println(((Integer.parseInt(tabla[9][8]))+(Integer.parseInt(tabla[9][7]))+(Integer.parseInt(tabla[9][6]))+(Integer.parseInt(tabla[9][5]))+(Integer.parseInt(tabla[9][4]))+(Integer.parseInt(tabla[9][3])))/6);
                
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
       
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        
    }
}
