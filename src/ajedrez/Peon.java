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
public class Peon extends Fichas {

    public Peon(int x, int y, color color) {
        this.x = x;
        this.y = y;
        negro = (color == color.negro);
        representacion = (negro) ? "♟" : "♙";
    }



    public String toString() {
        return (negro) ? "♟" : "♙";
    }

    public boolean movimiento(int x, int y, Tablero tablero) {

        MovimientosPeon moviment = new MovimientosPeon();
        return moviment.movimientoValido(x, y, this, tablero);
        /*
        if (tablero.esta(x, y)) {

            if (tablero.tablero[x][y].ocupada) {

                if (tablero.tablero[x][y].ficha.negro == this.negro) {
                    return false;
                }
            }
            int dX = 0, dY = 0;

            if ((x == this.x) && (y == this.y)) {
                return false;
            }

            dX = (x > this.x) ? +1 : dX;
            dX = (x < this.x) ? -1 : dX;

            dY = (y > this.y) ? +1 : dY;
            dY = (y < this.y) ? -1 : dY;

            if ( ( (y - this.y) == ( (negro) ? -1 : +1)) && (Math.abs(x - this.x) == 0) && !(tablero.tablero[x][y].ocupada) ) {
                return true;
            }
            
            if ( ( (Math.abs(y - this.y) == ( (negro) ? -2 : +2) ) && (Math.abs(x - this.x) == Math.abs(0) ) ) && (this.y == ( (negro) ? 6 : 1) ) ) {
                
                for (int c = 1; c < (Math.abs(y - this.y)); c++) {
                    
                    if (tablero.tablero[this.x + c * dX][this.y + c * dY].ocupada) {
                        return false;
                    }
                }
                return true;
            }
            
            if ( ( (y - this.y) == ( (negro) ? -1 : +1) ) && (Math.abs(x - this.x) == Math.abs(1) ) && (tablero.tablero[x][y].ocupada) ) {
                return true;
            }
        }
        return false;
        */
    }

}
