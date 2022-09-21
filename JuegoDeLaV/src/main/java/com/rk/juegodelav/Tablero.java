package com.rk.juegodelav;

public class Tablero {

    private Arreglo2DADT tablero;

    public Tablero() {
        tablero = new Arreglo2DADT(10, 10);
        for (int col = 0; col < 10; col++)
        {
            for (int ren = 0; ren < 10; ren++)
            {
                tablero.setElemento(ren, col, new Celula(ren, col));
            }
        }
        Celula aux;
        aux = (Celula) tablero.getElemento(1, 1);
        aux.setVida(true);
        aux = (Celula) tablero.getElemento(2, 2);
        aux.setVida(true);
        aux = (Celula) tablero.getElemento(2, 1);
        aux.setVida(true);
        aux = (Celula) tablero.getElemento(2, 3);
        aux.setVida(true);
        aux = (Celula) tablero.getElemento(3, 3);
        aux.setVida(true);
        aux = (Celula) tablero.getElemento(4, 3);
        aux.setVida(true);
        aux = (Celula) tablero.getElemento(5, 4);
        aux.setVida(true);
        aux = (Celula) tablero.getElemento(7, 9);
        aux.setVida(true);
        aux = (Celula) tablero.getElemento(8, 8);
        aux.setVida(true);
        aux = (Celula) tablero.getElemento(9, 0);
        aux.setVida(true);

        contarVecinos();
    }

    public void contarVecinos() {

        for (int col = 0; col < 10; col++)
        {
            for (int ren = 0; ren < 10; ren++)
            {
                Celula actual = (Celula) tablero.getElemento(ren, col);
                if (col > 0 && col < 9 && ren > 0 && ren < 9)
                {

                    for (int c = col - 1; c <= col + 1; c++)
                    {
                        for (int r = ren - 1; r <= ren + 1; r++)
                        {
                            Celula t = (Celula) tablero.getElemento(r, c);
                            if (t.isVida() && !(c == col && r == ren))
                            {
                                actual.setNumVecinosVivos(actual.getNumVecinosVivos() + 1);
                            }
                        }
                    }

                } else
                {

                    int cntCol, cntRen, maxCol,maxRen;
                    
                    if(col==0){
                        cntCol = 0;
                        maxCol = 2;
                    }else if(col==9){
                        cntCol = 8;
                        maxCol = 10;
                    }else{
                        cntCol = col-1;
                        maxCol = col+2;
                    }
                    
                    if(ren==0){
                        cntRen = 0;
                        maxRen = 2;
                    }else if(ren==9){
                        cntRen = 8;
                        maxRen = 10;
                    }else{
                        cntRen = ren-1;
                        maxRen = ren+2;
                    }
                    
                    for(int i = cntCol;i<maxCol;i++){
                        for(int j = cntRen; j<maxRen;j++){
                            Celula t = (Celula) tablero.getElemento(j, i);
                            if (t.isVida() && !(i == col && j == ren))
                            {
                                actual.setNumVecinosVivos(actual.getNumVecinosVivos() + 1);
                            }
                        }
                    }
                    
                    
                    
                }
            }
        }
    }

    public void reglas() {

        for (int col = 0; col < 10; col++)
        {
            for (int ren = 0; ren < 10; ren++)
            {
                Celula t = (Celula) tablero.getElemento(ren, col);
                if (t.isVida())
                {

                    if (t.getNumVecinosVivos() >= 4)
                    {
                        t.setVida(false);
                    } else if (t.getNumVecinosVivos() <= 1)
                    {
                        t.setVida(false);
                    }

                } else
                {
                    if (t.getNumVecinosVivos() == 3)
                    {

                        t.setVida(true);
                    }
                }
            }
        }
    }

    public Arreglo2DADT getTablero() {
        return tablero;
    }

}
