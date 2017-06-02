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
public class MovimientosReina {
            MovimientosAlfil alfil = new MovimientosAlfil();
            MovimientosTorre torre = new MovimientosTorre();
    
        public boolean comprobarDestino(int x, int y, Fichas ficha, Tablero tablero) {
        
        return alfil.comprobarDestino(x, y, ficha, tablero) || torre.comprobarDestino(x, y, ficha, tablero);
        }
    
    
    public boolean comprobarRecorrido(int x, int y, Fichas ficha, Tablero tablero) {
    return alfil.comprobarRecorrido(x, y, ficha, tablero) || torre.comprobarRecorrido(x, y, ficha, tablero);
    }
}
