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
public class Torre extends Fichas {
   public Torre(int x, int y, color color) {
        xinicial = this.x = x;
        yinicial = this.y = y;
        negro = (color == color.negro);
        letra= "T";
    }

    public Torre(color color) {
        negro = (color == color.negro);
    }
    public boolean movimiento() {
        return true;
    }
}
