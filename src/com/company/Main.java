package com.company;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartaRandom cartaRandom = new CartaRandom();


        int carta1Dealer = cartaRandom.GenerarCarta();
        int carta2Dealer = cartaRandom.GenerarCarta();
        int sumaDealer = carta1Dealer + carta2Dealer;

        int carta1Jugador = cartaRandom.GenerarCarta();
        int carta2Jugador = cartaRandom.GenerarCarta();
        int sumaJugador = carta1Jugador + carta2Jugador;

        System.out.println("Cartas del Dealer: ");
        System.out.println(carta1Dealer+","+carta2Dealer+ " ("+sumaDealer+")");

        System.out.println("Tus cartas:");
        System.out.println(carta1Jugador+","+carta2Jugador+ " ("+sumaJugador+")");



        System.out.println();
        System.out.println("Pedir= true | Parar = false");
        Boolean pedir = scanner.nextBoolean();


        while (pedir == true) {
            System.out.println("estas dentro del bucle");
            pedir = scanner.nextBoolean();
        }



        System.out.println("Final");
    }
}
