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
public class DamaReina extends Fichas {

    public DamaReina(int x, int y, Fichas.color color) {
        this.x = x;
        this.y = y;
        negro = (color == color.negro);
        representacion = (negro) ? "♛" : "♕";
    }

    public String toString() {
        return (negro) ? "♛" : "♕";
    }

    public boolean movimiento(int x, int y, Tablero tablero) {
        matar = false;
        MovimientosDamaReina moviment = new MovimientosDamaReina();
        return moviment.movimientoValido(x, y, this, tablero);
    }
    
}