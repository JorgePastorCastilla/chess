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
public class MovimientosCaballo extends Movimientos {

    public boolean comprobarDestino(int x, int y, Fichas ficha, Tablero tablero) {

        //NO ESTA ACABADO
        if (tablero.esta(x, y)) {

            if (tablero.tablero[x][y].ocupada) {

                if (tablero.tablero[x][y].ficha.negro == ficha.negro) {
                    return false;
                }
            }

            if ((x == ficha.x) && (y == ficha.y)) {
                return false;
            }

            if (((Math.abs(x - ficha.x) == 1) && (Math.abs(y - ficha.y) == 2)) || ((Math.abs(y - ficha.y) == 1) && (Math.abs(x - ficha.x) == 2))) {
                return true;
            }

        }
        return false;
    }

    public boolean comprobarRecorrido(int x, int y, Fichas ficha, Tablero tablero) {
        return true;
    }

}
