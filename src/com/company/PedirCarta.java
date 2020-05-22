package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PedirCarta {

    Scanner scanner = new Scanner(System.in);
    CartasDealer cartasDealer = new CartasDealer();
    CartasJugador cartasJugador = new CartasJugador();
    SumaCartas sumaCartas = new SumaCartas();
    CartaRandom cartaRandom = new CartaRandom();

    String mensagePedir = "Pedir= true | Parar = false";
    Boolean pasado = false;
    Boolean pedir;

    public void getPedirCarta() {

        pedir = scanner.nextBoolean();

        for (int i = 0; pedir == true; i++) {
            //Mostrar Cartas Dealer
            cartasDealer.imprimirCartas(false);
            //Suma de cartas del Dealer
            sumaCartas.getSumaCartasJugador(cartasDealer.cartaDealer.length, cartasDealer.cartaDealer);

            //Hacer mas grande el Array sin perder datos
            cartasJugador.cartasPedidasJugador++;
            cartasJugador.cartaJugador = Arrays.copyOf(cartasJugador.cartaJugador, cartasJugador.cartaJugador.length + 1);
            cartasJugador.cartaJugador[cartasJugador.cartasPedidasJugador-1] = cartaRandom.GenerarCarta();

            // Mostrar Cartas Deal *CON CARTAS PEDIDAS*
            System.out.println("Tus Cartas: ");
            for (int j = 0; j < cartasJugador.cartasPedidasJugador ; j++) {
                System.out.print(cartasJugador.cartaJugador[j]+" | ");
            }

            //Suma de cartas del Jugador
            sumaCartas.getSumaCartasJugador(cartasJugador.cartaJugador.length, cartasJugador.cartaJugador);


            //Se pasa o no
            if (sumaCartas.sumaCartasJugador > 21) {
                System.out.println("PERDIDA: TE HAS PASADO DE 21");
                pasado = true;
                break;
            }

            //Mensage Pedir o parar
            System.out.println();
            System.out.println("Pedir= true | Parar = false");
            pedir = scanner.nextBoolean();
        }

    }
}
