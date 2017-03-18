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
    Fichas[] paco = { sd
        new Peon(1, 0, Peon.color.negro)
    };

    enum fichas {
        Peon, Alfil, Caballo, Torre, Reina, Rey
    }*/
    public void chessIni() {
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 8; y++) {
                if (x % 2 == 0) {
                    if ((y == 0) || (y == 7)) {
                        tablero[x][y].guardarFicha(new Torre(x, y, Fichas.color.blanco));
                    }
                    if ((y == 1) || (y == 6)) {
                        tablero[x][y].guardarFicha(new Caballo(x, y, Fichas.color.blanco));
                    }
                    if ((y == 2) || (y == 5)) {
                        tablero[x][y].guardarFicha(new Alfil(x, y, Fichas.color.blanco));
                    }
                    if (y == 3) {
                        tablero[x][y].guardarFicha(new Rey(x, y, Fichas.color.blanco));
                    }
                    if (y == 4) {
                        tablero[x][y].guardarFicha(new Reina(x, y, Fichas.color.blanco));
                    }
                } else {
                    tablero[x][y].guardarFicha(new Peon(x, y, Fichas.color.blanco));
                }
            }
        }
        for (int x = 6; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if (x % 2 != 0) {
                    if ((y == 0) || (y == 7)) {
                        tablero[x][y].guardarFicha(new Torre(x, y, Fichas.color.negro));
                    }
                    if ((y == 1) || (y == 6)) {
                        tablero[x][y].guardarFicha(new Caballo(x, y, Fichas.color.negro));
                    }
                    if ((y == 2) || (y == 5)) {
                        tablero[x][y].guardarFicha(new Alfil(x, y, Fichas.color.negro));
                    }
                    if (y == 3) {
                        tablero[x][y].guardarFicha(new Rey(x, y, Fichas.color.negro));
                    }
                    if (y == 4) {
                        tablero[x][y].guardarFicha(new Reina(x, y, Fichas.color.negro));
                    }
                } else {
                    tablero[x][y].guardarFicha(new Peon(x, y, Fichas.color.negro));
                }
            }
        }
    }

    public Tablero() {
        ini();
        chessIni();
    }

    int fil = 8;
    int col = 8;
    Casillas[][] tablero = new Casillas[fil][col];

    public boolean esta(int x, int y) {
        return (((x >= 0) && (x < col)) && ((y >= 0) && (y < fil)));
    }

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

    public void mover(int x1, int y1, int x2, int y2) {
        if ((esta(x1,y1)) && (esta(x2,y2))){
            //tablero[x1][y1] tablero[x2][y2]
        }
    }
    /*
    public void colocarFichaInicial(int x, int y, Fichas ficha){
        tablero[x][y].guardarFicha(ficha);
        ficha.posicion(x,y);
    }*/

}
