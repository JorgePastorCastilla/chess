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
public class Ajedrez extends Juegos{
    
    public void inicializarJuego(Tablero tablero){
                for (int y = 0; y < 2; y++) {
            for (int x = 0; x < 8; x++) {
                if (y % 2 == 0) {
                    if ((x == 0) || (x == 7)) {
                        tablero.tablero[x][y].guardarFicha(new Torre(x, y, Fichas.color.blanco));
                    }
                    if ((x == 1) || (x == 6)) {
                        tablero.tablero[x][y].guardarFicha(new Caballo(x, y, Fichas.color.blanco));
                    }
                    if ((x == 2) || (x == 5)) {
                        tablero.tablero[x][y].guardarFicha(new Alfil(x, y, Fichas.color.blanco));
                    }
                    if (x == 3) {
                        tablero.tablero[x][y].guardarFicha(new Rey(x, y, Fichas.color.blanco));
                    }
                    if (x == 4) {
                        tablero.tablero[x][y].guardarFicha(new Reina(x, y, Fichas.color.blanco));
                    }
                } else {
                    tablero.tablero[x][y].guardarFicha(new Peon(x, y, Fichas.color.blanco));
                }
            }
        }
        for (int y = 6; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (y % 2 != 0) {
                    if ((x == 0) || (x == 7)) {
                        tablero.tablero[x][y].guardarFicha(new Torre(x, y, Fichas.color.negro));
                    }
                    if ((x == 1) || (x == 6)) {
                        tablero.tablero[x][y].guardarFicha(new Caballo(x, y, Fichas.color.negro));
                    }
                    if ((x == 2) || (x == 5)) {
                        tablero.tablero[x][y].guardarFicha(new Alfil(x, y, Fichas.color.negro));
                    }
                    if (x == 3) {
                        tablero.tablero[x][y].guardarFicha(new Rey(x, y, Fichas.color.negro));
                    }
                    if (x == 4) {
                        tablero.tablero[x][y].guardarFicha(new Reina(x, y, Fichas.color.negro));
                    }
                } else {
                    tablero.tablero[x][y].guardarFicha(new Peon(x, y, Fichas.color.negro));
                }
            }
        }
    }
    public boolean ganar(Tablero tablero){
                int c = 0;
        for (int CX = 0; CX < tablero.col; CX++) {
            for (int CY = 0; CY < tablero.fil; CY++) {
                if (tablero.tablero[CX][CY].ocupada && (tablero.tablero[CX][CY].ficha instanceof Rey)) {
                    c++;
                }

            }
        }
        return (c < 2);
    }
    
    
}
