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
    int[][] movimientos ={
    {0,1},
    {0,-1},
    {1,0},
    {-1,0}
};
   public Torre(int x, int y, color color) {
        xinicial = this.x = x;
        yinicial = this.y = y;
        negro = (color == color.negro);
        representacion= (negro) ? "♖" : "♜";  }

    public Torre(color color) {
        negro = (color == color.negro);
    }
    public boolean movimiento() {
        return true;
    }
}
