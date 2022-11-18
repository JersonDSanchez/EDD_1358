
package com.mycompany.tablashash;

public class TablasHash {

    public static void main(String[] args) {
        TablaHash prueba= new TablaHash(20);
        prueba.add(22, 540);
        prueba.add(15, 986);
        prueba.add(17, 999);
        prueba.add(13, 356);
        prueba.add(8, 452);
        prueba.add(40, 101);
        System.out.println(prueba);

        prueba.remove(22);
        prueba.remove(15);
        prueba.remove(17);
        prueba.remove(13);
        prueba.remove(8);
        prueba.remove(40);
        
        System.out.println(prueba);
        
    }
}
