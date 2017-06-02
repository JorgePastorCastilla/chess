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
public class MovimientosDama extends Movimientos {

    public boolean comprobarDestino(int x, int y, Fichas ficha, Tablero tablero) {

        if (tablero.esta(x, y)) {
            if (tablero.tablero[x][y].ocupada) {
                return false;
            }
            if ((Math.abs(x - ficha.x) == Math.abs(y - ficha.y)) && ((y - ficha.y) == ((ficha.negro) ? -1 : +1))) {
                return true;
            }
            
            int dX = 0, dY = 0;
            
            dX = (x > ficha.x) ? +1 : dX;
            dX = (x < ficha.x) ? -1 : dX;
            
            dY = (y > ficha.y) ? +1 : dY;
            dY = (y < ficha.y) ? -1 : dY;
            
            if ((Math.abs(x - ficha.x) == Math.abs(y - ficha.y))
                    && (Math.abs(y - ficha.y) == 2)
                    && (
                        (tablero.tablero[x - dX][y - dY].ocupada) 
                        && !(tablero.tablero[x - dX][y - dY].ficha.negro == ficha.negro))) {
                tablero.tablero[x - dX][y - dY].desocupar();
                ficha.matar = true;
                return true;
            }//12,34,12,23,25,34,32,43,34,12
            /*
            (tablero.tablero[(Math.abs(x + ficha.x) / 2)][(Math.abs(y + ficha.y) / 2)].ocupada) 
                        && !(tablero.tablero[(Math.abs(x + ficha.x) / 2)][(Math.abs(y + ficha.y) / 2)].ficha.negro == ficha.negro))) {
                tablero.tablero[(Math.abs(x + ficha.x) / 2)][(Math.abs(y + ficha.y) / 2)].desocupar();
                return true;
            */

        }

        return false;
    }

    public boolean comprobarRecorrido(int x, int y, Fichas ficha, Tablero tablero) {
        
        int esReina = (ficha.negro) ? 0 : 7;
        
        if (y == esReina){
            tablero.tablero[ficha.x][ficha.y].guardarFicha(new DamaReina(ficha.x,ficha.y, (ficha.negro) ? Fichas.color.negro : Fichas.color.blanco));
        }
        
        return true;
    }
    //mover 1 en diagonal solo hacia adelante, mover dos si a la mitad hay una ficha del otro color y la posicion final esta libre
}
