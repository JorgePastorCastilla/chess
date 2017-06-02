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
public class Tablero {

    /*
    Fichas[] paco = { sd
        new Peon(1, 0, Peon.color.negro)
    };

    enum fichas {
        Peon, Alfil, Caballo, Torre, Reina, Rey
    }*/
    boolean win = false;

    Juegos juego;

    public enum juegos {
        Ajedrez, SoldatsDelRey, Damas
    }

    public Tablero() {
        ini();
    }

    public Tablero(juegos J) {
        switch (J) {
            case Ajedrez:
                juego = new Ajedrez();
                break;
            case SoldatsDelRey:
                juego = new SoldatsRei();
                break;
            case Damas:
                juego = new JuegoDamas();
                break;
        }
        ini();
        juego.inicializarJuego(this);
    }

    int fil = 8;
    int col = 8;
    Casillas[][] tablero = new Casillas[col][fil];

    public boolean esta(int x, int y) {
        return (((x >= 0) && (x < col)) && ((y >= 0) && (y < fil)));
    }

    public void ini() {
        for (int x = 0; x < fil; x++) {
            boolean negri = (x % 2 == 0) ? false : true;
            for (int y = 0; y < col; y++) {
                tablero[y][x] = (negri) ? new Casillas(Casillas.colores.negro) : new Casillas(Casillas.colores.blanco);
                negri = !negri;
            }
        }
    }

    public void mostrar() {

        for (int y = 0; y < fil; y++) {
            for (int x = 0; x < col; x++) {
                System.out.print(tablero[x][y] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public boolean mover(int x1, int y1, int x2, int y2) {

        if ((esta(x1, y1)) && (esta(x2, y2))) {

            if (tablero[x1][y1].ficha.movimiento(x2, y2, this)) {

                tablero[x2][y2].guardarFicha(tablero[x1][y1].ficha);

               // tablero[x1][y1].ficha.matar(x2, y2, this);
                
                tablero[x2][y2].ficha.setPosicion(x2, y2);

                tablero[x1][y1].desocupar();

                win = comproGanar();
                
                GuardarPartida.guarda(this);
                
                return true;

            } else {

                //System.out.println("padre lo de la fichaaaaaaaaa");
                return false;

            }
        } else {

            //System.out.println("padre lo de la ficha");
            return false;

        }
    }
//  git commit -m "main ya funcional, creacio de la clase 'Juegos' para implementar despues los diversos juegos al tablero"

    public boolean comproGanar() {
        return this.juego.ganar(this);
    }
    /*
    public void colocarFichaInicial(int x, int y, Fichas ficha){
        tablero[x][y].guardarFicha(ficha);
        ficha.posicion(x,y);
    }*/

}
