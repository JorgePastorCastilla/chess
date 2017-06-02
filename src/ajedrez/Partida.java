/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.util.Scanner;
import java.io.Serializable;

/**
 *
 * @author ifc33a
 */
public class Partida implements Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tablero tablero = new Tablero();
        int carga, selecJuego;

        System.out.println("Selecciona el juego Ajedrez(0) Soldats del rei(1) Damas(2) ");
        selecJuego = sc.nextInt();

        System.out.println("Cargar(0) o Nueva(1)");

        carga = sc.nextInt();
//12,34,12,23,25,34,32,43,34,12
        if (carga == 0) {
            if (selecJuego == 0) {
                tablero.juego = new Ajedrez();
            }
            if (selecJuego == 1) {
                tablero.juego = new SoldatsRei();
            }
            if (selecJuego == 2) {
                tablero.juego = new JuegoDamas();
            }
            CargarPartida.cargar(tablero);
        } else {
            if (selecJuego == 0) {
                tablero = new Tablero(Tablero.juegos.Ajedrez);
            }
            if (selecJuego == 1) {
                tablero = new Tablero(Tablero.juegos.SoldatsDelRey);
            }
            if (selecJuego == 2) {
                tablero = new Tablero(Tablero.juegos.Damas);
            }
        }
        tablero.mostrar();

        int numjugador = 1;

        System.out.println("EMPIEZAN LAS BLANCAS");
        System.out.println("");
        while (!tablero.win) {
            System.out.println("Turno del jugador " + ((numjugador) == 1 ? 1 : 2));

            pedirMovimiento(tablero, numjugador);
            numjugador = (numjugador + 1) % 2;
            tablero.mostrar();
        }
        System.out.println("GANA JUGADOR " + numjugador + 1);
    }

    public static void pedirMovimiento(Tablero tablero, int numjugador) {
        tablero.mostrar();

        int X1, Y1, X2, Y2;

        X1 = pedirCoordenadaX();
        Y1 = pedirCoordenadaY();
        X2 = pedirCoordenadaX();
        Y2 = pedirCoordenadaY();

        while (!tablero.esta(X1, Y1) || !tablero.esta(X2, Y2)) {

            tablero.mostrar();
            System.out.println("Fuera del tablero");
            System.out.println("");
            X1 = pedirCoordenadaX();
            Y1 = pedirCoordenadaY();
            X2 = pedirCoordenadaX();
            Y2 = pedirCoordenadaY();
        }
        while ((numjugador == 1) ? tablero.tablero[X1][Y1].ficha.negro : !tablero.tablero[X1][Y1].ficha.negro) {

            tablero.mostrar();
            System.out.println("No puedes mover las piezas del contrario");
            System.out.println("");
            X1 = pedirCoordenadaX();
            Y1 = pedirCoordenadaY();
            X2 = pedirCoordenadaX();
            Y2 = pedirCoordenadaY();
        }
        while (!tablero.mover(X1, Y1, X2, Y2)) {
            tablero.mostrar();
            System.out.println("Movimiento incorrecto");
            System.out.println("");
            X1 = pedirCoordenadaX();
            Y1 = pedirCoordenadaY();
            X2 = pedirCoordenadaX();
            Y2 = pedirCoordenadaY();
        }
        while (tablero.tablero[X2][Y2].ficha.matar) {
            tablero.mostrar();
            System.out.println("Vuelve a tirar");
            System.out.println("");
            X1 = X2;
            Y1 = Y2;
            X2 = pedirCoordenadaX();
            Y2 = pedirCoordenadaY();

            while (!tablero.mover(X1, Y1, X2, Y2)) {
                tablero.mostrar();
                System.out.println("Movimiento incorrecto");
                System.out.println("");
                X2 = pedirCoordenadaX();
                Y2 = pedirCoordenadaY();
            }
            if (tablero.win) {
                break;
            }
        }

    }

    public static int pedirCoordenadaX() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Que columna seleccionas");
        return sc1.nextInt();
    }

    public static int pedirCoordenadaY() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Que fila seleccionas");
        return sc1.nextInt();
    }
}
