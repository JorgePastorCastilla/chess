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
public class Rey  extends Fichas {
   public Rey(int x, int y, color color) {
        this.x = x;
        this.y = y;
        negro = (color == color.negro);
        representacion= (negro) ? "♚" : "♔";    }

    public Rey(color color) {
        negro = (color == color.negro);
    }
    public void setPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
        public String toString(){
        return (negro) ? "♚" : "♔";
    }
    public boolean movimiento(int x, int y, Tablero tablero) {
        MovimientosRey moviment = new MovimientosRey();
        return moviment.movimientoValido(x, y, this, tablero);
    }
    /*
    comprovar que todas las piezas del enemigo no puedan matar al rey en la posicion final
    */
}
