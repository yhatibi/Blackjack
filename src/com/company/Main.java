package com.company;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartasDealer cartasDealer = new CartasDealer();
        CartasJugador cartasJugador = new CartasJugador();
        SumaCartas sumaCartas = new SumaCartas();
        CartaRandom cartaRandom = new CartaRandom();


        //Mostrar Cartas Dealer
        cartasDealer.generarCartas();
        cartasDealer.imprimirCartas(false);
        //Suma de cartas del Dealer
        sumaCartas.getSumaCartasJugador(cartasDealer.cartaDealer.length, cartasDealer.cartaDealer);

        //Mostrar Cartas Jugador
        cartasJugador.generarCartas();
        cartasJugador.imprimirCartas();
        //Suma de cartas del Jugador
        sumaCartas.getSumaCartasJugador(cartasJugador.cartaJugador.length, cartasJugador.cartaJugador);


        //Mensage Pedir o parar
        System.out.println();
        System.out.println("Pedir= true | Parar = false");

        //Pedir carta para el jugador
        Boolean pasado = false;
        Boolean pedir = scanner.nextBoolean();
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


        //Plantar
        if ( pasado != true) {
            if (sumaCartas.sumaCartasJugador > cartasDealer.sumaDealer) {

                //Mostrar Cartas Dealer
                cartasDealer.imprimirCartas(false);
                //Suma de cartas del Dealer
                sumaCartas.getSumaCartasJugador(cartasDealer.cartaDealer.length, cartasDealer.cartaDealer);

                // Mostrar Cartas Jugador *CON CARTAS PEDIDAS*
                System.out.println();
                System.out.println("Tus Cartas: ");
                for (int j = 0; j < cartasJugador.cartasPedidasJugador ; j++) {
                    System.out.print(cartasJugador.cartaJugador[j]+" | ");
                }

                //Suma de cartas del Jugador
                sumaCartas.getSumaCartasJugador(cartasJugador.cartaJugador.length, cartasJugador.cartaJugador);

                //Mensage GANADA
                System.out.println("GANADA: Dealer tiene peores cartas");
            } else {
                //Mostrar Cartas Dealer
                cartasDealer.imprimirCartas(true);
                //Suma de cartas del Dealer
                sumaCartas.getSumaCartasJugador(cartasDealer.cartaDealer.length, cartasDealer.cartaDealer);

                // Mostrar Cartas Jugador *CON CARTAS PEDIDAS*
                System.out.println();
                System.out.println("Tus Cartas: ");
                for (int j = 0; j < cartasJugador.cartasPedidasJugador ; j++) {
                    System.out.print(cartasJugador.cartaJugador[j]+" | ");
                }

                //Suma de cartas del Jugador
                sumaCartas.getSumaCartasJugador(cartasJugador.cartaJugador.length, cartasJugador.cartaJugador);

                //Mesage PERDIDA
                System.out.println("PERDIDA: Dealer tiene mejores cartas!");
            }
        }



        System.out.println("Final");
    }
}
