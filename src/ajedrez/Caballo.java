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
public class Caballo extends Fichas {

    public Caballo(int x, int y, color color) {
        this.x = x;
        this.y = y;
        negro = (color == color.negro);
        representacion = (negro) ? "♞" : "♘";
    }

    public Caballo(color color) {
        negro = (color == color.negro);
    }

    public void setPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return (negro) ? "♞" : "♘";
    }

    public boolean movimiento(int x, int y, Tablero tablero) {

        
        MovimientosCaballo moviment = new MovimientosCaballo();
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

            if (((Math.abs(x - this.x) == 1) && (Math.abs(y - this.y) == 2)) || ((Math.abs(y - this.y) == 1) && (Math.abs(x - this.x) == 2))) {
                return true;
            }

        }
        return false;
        */
    }
}
