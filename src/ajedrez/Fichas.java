/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.io.*;
/**
 *
 * @author ifc33a
 */
public abstract class Fichas implements Serializable{

    //declarar metodos abstractos para las subclases
    int x;
    int y;

    String representacion ; 

    //public abstract boolean movimiento();

    public void setPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    boolean negro;
    public boolean matar = false;

    enum color {
        blanco, negro
    };
    public abstract boolean movimiento(int x, int y, Tablero tablero);
    //public boolean matar(int x, int y, Tablero tablero){return false;}
    public abstract String toString();

}
