/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author ifc33a
 */
public class Tablero {
/*
    Fichas[] paco = {
        new Peon(1, 0, Peon.color.negro)
    };

    enum fichas {
        Peon, Alfil, Caballo, Torre, Reina, Rey
    }*/
//fichas negras
    
    
    public Tablero() {
        ini();
    }
    Fichas[] blancas = {
        new Torre(0,0,Fichas.color.blanco),
        new Caballo(0,1,Fichas.color.blanco),
        new Alfil(0,2,Fichas.color.blanco),
        new Rey(0,3,Fichas.color.blanco),
        new Reina(0,4,Fichas.color.blanco),
        new Alfil(0,5,Fichas.color.blanco),
        new Caballo(0,6,Fichas.color.blanco),
        new Torre(0,7,Fichas.color.blanco),
        
      new Peon(1,0,Fichas.color.blanco),
      new Peon(1,1,Fichas.color.blanco),
      new Peon(1,2,Fichas.color.blanco),
      new Peon(1,3,Fichas.color.blanco),
      new Peon(1,4,Fichas.color.blanco),
      new Peon(1,5,Fichas.color.blanco),
      new Peon(1,6,Fichas.color.blanco),
      new Peon(1,7,Fichas.color.blanco),
    };
        Fichas[] negras = {
        new Torre(7,0,Fichas.color.negro),
        new Caballo(7,1,Fichas.color.negro),
        new Alfil(7,2,Fichas.color.negro),
        new Rey(7,3,Fichas.color.negro),
        new Reina(7,4,Fichas.color.negro),
        new Alfil(7,5,Fichas.color.negro),
        new Caballo(7,6,Fichas.color.negro),
        new Torre(7,7,Fichas.color.negro),
        
      new Peon(6,0,Fichas.color.negro),
      new Peon(6,1,Fichas.color.negro),
      new Peon(6,2,Fichas.color.negro),
      new Peon(6,3,Fichas.color.negro),
      new Peon(6,4,Fichas.color.negro),
      new Peon(6,5,Fichas.color.negro),
      new Peon(6,6,Fichas.color.negro),
      new Peon(6,7,Fichas.color.negro),
    };
    int fil = 8;
    int col = 8;
    Casillas[][] tablero = new Casillas[fil][col];

    public void ini() {
        for (int x = 0; x < fil; x++) {
            boolean negri = (x % 2 == 0) ? false : true;
            for (int y = 0; y < col; y++) {
                tablero[x][y] = (negri) ? new Casillas(Casillas.colores.negro) : new Casillas(Casillas.colores.blanco);
                negri = !negri;
            }
        }
    }

    public void mostrar() {

        for (int x = 0; x < fil; x++) {
            for (int y = 0; y < col; y++) {
                System.out.print(tablero[x][y] + " ");
            }
            System.out.println("");
        }
    }
    /*
    public void colocarFichaInicial(int x, int y, Fichas ficha){
        tablero[x][y].guardarFicha(ficha);
        ficha.posicionInicial(x,y);
    }*/

}
