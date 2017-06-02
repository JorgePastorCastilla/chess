/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author Jordi
 */
public class MovimientosPeon extends Movimientos {

    public boolean comprobarDestino(int x, int y, Fichas ficha, Tablero tablero) {

        if (tablero.esta(x, y)) {

            if (tablero.tablero[x][y].ocupada) {

                if (tablero.tablero[x][y].ficha.negro == ficha.negro) {
                    return false;
                }
            }

            if ((x == ficha.x) && (y == ficha.y)) {
                return false;
            }

            if ( ( (y - ficha.y) == ( (ficha.negro) ? -1 : +1)) && (Math.abs(x - ficha.x) == 0) && !(tablero.tablero[x][y].ocupada) ) {
                return true;
            }
            
            if ( ( (Math.abs(y - ficha.y) == 2 ) && (Math.abs(x - ficha.x) == Math.abs(0) ) ) && (ficha.y == ( (ficha.negro) ? 6 : 1) ) ) {
                return true;
            }
            
            if ( ( (y - ficha.y) == ( (ficha.negro) ? -1 : +1) ) && (Math.abs(x - ficha.x) == Math.abs(1) ) && (tablero.tablero[x][y].ocupada) ) {
                return true;
            }
            
        }
        return false;
    }

    public boolean comprobarRecorrido(int x, int y, Fichas ficha, Tablero tablero) {
        int dX = 0, dY = 0;

        dX = (x > ficha.x) ? +1 : dX;
        dX = (x < ficha.x) ? -1 : dX;

        dY = (y > ficha.y) ? +1 : dY;
        dY = (y < ficha.y) ? -1 : dY;

        for (int c = 1; c < (Math.abs(x - ficha.x)); c++) {
            if (tablero.tablero[ficha.x + c * dX][ficha.y + c * dY].ocupada) {
                return false;
            }
        }
        return true;

    }



}