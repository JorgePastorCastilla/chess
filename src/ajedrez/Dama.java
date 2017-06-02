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
public class Dama extends Fichas {

    public Dama(int x, int y, color color) {
        this.x = x;
        this.y = y;
        negro = (color == color.negro);
        representacion = (negro) ? "♟" : "♙";
    }

    public String toString() {
        return (negro) ? "♟" : "♙";
    }

    public boolean movimiento(int x, int y, Tablero tablero) {
        matar = false;
        MovimientosDama moviment = new MovimientosDama();
        return moviment.movimientoValido(x, y, this, tablero);
    }
    /*
    public boolean matar(int x, int y, Tablero tablero){
                    int dX = 0, dY = 0;
            
            dX = (x > this.x) ? +1 : dX;
            dX = (x < this.x) ? -1 : dX;
            
            dY = (y > this.y) ? +1 : dY;
            dY = (y < this.y) ? -1 : dY;
        
    if ((Math.abs(x - this.x) == Math.abs(y - this.y))
                    && (Math.abs(y - this.y) == 2)
                    && (
                        (tablero.tablero[x - dX][y - dY].ocupada) 
                        && !(tablero.tablero[x - dX][y - dY].ficha.negro == this.negro))) {
                tablero.tablero[x - dX][y - dY].desocupar();
                return true;
            }
    return false;
}*/
    
}
