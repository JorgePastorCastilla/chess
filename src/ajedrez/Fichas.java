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
public abstract class Fichas {

    //declarar metodos abstractos para las subclases
    int xinicial;
    int yinicial;
    int x;
    int y;
    String letra= "F";

    public abstract boolean movimiento();

    public void posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    boolean negro;
    public boolean muerto = false;

    enum color {
        blanco, negro
    };
    public String toString(){
        return letra;
    }

}
