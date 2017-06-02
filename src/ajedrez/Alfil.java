/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author ifc33afdasfafas
 */
public class Alfil extends Fichas {

    public Alfil(int x, int y, color color) {
        this.x = x;
        this.y = y;
        negro = (color == color.negro);
        representacion = (negro) ? "♝" : "♗";
    }

    public void setPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return (negro) ? "♝" : "♗";
    }

    public Alfil(color color) {
        negro = (color == color.negro);
    }

    public boolean movimiento(int x, int y, Tablero tablero) {

        MovimientosAlfil moviment = new MovimientosAlfil();
        
        return moviment.movimientoValido(x, y, this, tablero);
        /*
        if (tablero.esta(x, y)) {

            if (tablero.tablero[x][y].ocupada) {

                if (tablero.tablero[x][y].ficha.negro == this.negro) {
                    return false;
                }
            }

            if ((x == this.x) && (y == this.y)) {
                return false;
            }
            int dX = 0, dY = 0;

            dX = (x > this.x) ? +1 : dX;
            dX = (x < this.x) ? -1 : dX;

            dY = (y > this.y) ? +1 : dY;
            dY = (y < this.y) ? -1 : dY;

            if ((Math.abs(x - this.x)) == (Math.abs(y - this.y) ) ) {
                for (int c = 1; c < (Math.abs(x - this.x)); c++) {
                    if (tablero.tablero[this.x + c * dX][this.y + c * dY].ocupada) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
        */
    }

}
/*
    incremento de filas y columnas es igual <-- if para los movimientos del alfil
    
    
    
        
 */
