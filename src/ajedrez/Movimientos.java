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
public abstract class Movimientos{
    
    public abstract  boolean comprobarDestino(int x, int y, Fichas ficha, Tablero tablero);
    public abstract boolean comprobarRecorrido(int x, int y, Fichas ficha, Tablero tablero);
    public boolean movimientoValido(int x, int y, Fichas ficha, Tablero tablero){
               return comprobarDestino(x, y, ficha, tablero) && comprobarRecorrido(x, y, ficha, tablero);
    } 

}
