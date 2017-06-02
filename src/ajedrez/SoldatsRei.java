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
public class SoldatsRei extends Ajedrez {

    public void inicializarJuego(Tablero tablero) {
        for (int y = 0; y < 2; y++) {
            for (int x = 0; x < 8; x++) {
                if (y % 2 == 0) {
                    if (x == 3) {
                        tablero.tablero[x][y].guardarFicha(new Rey(x, y, Fichas.color.blanco));
                    }
                } else {
                    tablero.tablero[x][y].guardarFicha(new Peon(x, y, Fichas.color.blanco));
                }
            }
        }
        for (int y = 6; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (y % 2 != 0) {
                    if (x == 3) {
                        tablero.tablero[x][y].guardarFicha(new Rey(x, y, Fichas.color.negro));
                    }
                } else {
                    tablero.tablero[x][y].guardarFicha(new Peon(x, y, Fichas.color.negro));
                }
            }
        }
    }
}
