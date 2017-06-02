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
public class MovimientosDamaReina extends Movimientos {

    public boolean comprobarDestino(int x, int y, Fichas ficha, Tablero tablero) {

        if (tablero.esta(x, y)) {
            if (tablero.tablero[x][y].ocupada) {
                return false;
            }

            int dX = 0, dY = 0;

            dX = (x > ficha.x) ? +1 : dX;
            dX = (x < ficha.x) ? -1 : dX;

            dY = (y > ficha.y) ? +1 : dY;
            dY = (y < ficha.y) ? -1 : dY;

            if ((Math.abs(x - ficha.x) == Math.abs(y - ficha.y) )
                    && (tablero.tablero[x - dX][y - dY].ocupada 
                        && !(tablero.tablero[x - dX][y - dY].ficha.negro == ficha.negro))
               ) {
                if (comprobarRecorrido(x,y,ficha, tablero)){
                tablero.tablero[x - dX][y - dY].desocupar();
                ficha.matar = true;
                }
                return true;
            }//10,21,25,34,32,43,34,12
            if ((Math.abs(x - ficha.x) == Math.abs(y - ficha.y) ) ) {
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

        for (int c = 1; c < (Math.abs((x - dX) - ficha.x)); c++) {
            if (tablero.tablero[ficha.x + c * dX][ficha.y + c * dY].ocupada) {
                return false;
            }
        }
        return true;
    }

    //mover 1 en diagonal solo hacia adelante, mover dos si a la mitad hay una ficha del otro color y la posicion final esta libre
}
