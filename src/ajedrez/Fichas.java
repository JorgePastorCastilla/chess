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
    public abstract boolean movimiento();
    public boolean muerto = false;
    enum color {blanco,negro};
    String color;
   

}

