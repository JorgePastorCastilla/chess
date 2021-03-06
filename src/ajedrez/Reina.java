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
public class Reina extends Fichas {
   public Reina(int x, int y, color color) {
        this.x = x;
        this.y = y;
        negro = (color == color.negro);
        representacion= (negro) ? "♛" : "♕";    }

    public Reina(color color) {
        negro = (color == color.negro);
    }
    public void setPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
        public String toString(){
        return (negro) ? "♛" : "♕";  
    }
    public boolean movimiento(int x, int y, Tablero tablero) {
        
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

            if ( ( (x == this.x) || (y == this.y) ) || ( (Math.abs(x - this.x) ) == (Math.abs(y - this.y) ) ) ) {

                for (int c = 1; c < (Math.abs(x - this.x)); c++) {
                    if (tablero.tablero[this.x + c * dX][this.y + c * dY].ocupada) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
