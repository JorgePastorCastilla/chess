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
public class MovimientosRey extends Movimientos {

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

            if ((Math.abs(x - ficha.x) <= 1) && (Math.abs(y - ficha.y) <= 1)) {
                return true;
            }
        }
        for (int CX = 0; CX < tablero.col; CX++) {
            for (int CY = 0; CY < tablero.col; CY++) {
                if (tablero.tablero[CX][CY].ocupada){
                    if (tablero.tablero[CX][CY].ficha.movimiento(x, y, tablero)){
                        return false;
                    }
                }
            }

        }
        return false;
    }

    public boolean comprobarRecorrido(int x, int y, Fichas ficha, Tablero tablero) {
        return true;

    }
}
