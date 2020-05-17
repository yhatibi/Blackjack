package com.company;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartasDealer cartasDealer = new CartasDealer();
        CartasJugador cartasJugador = new CartasJugador();

        //Mostrar Cartas
        cartasDealer.getCartaDealer(2);
        cartasJugador.getCartasJugador(2);

        System.out.println();
        System.out.println("Pedir= true | Parar = false");

        Boolean pedir = scanner.nextBoolean();

        while (pedir == true) {
            System.out.println("estas dentro del bucle");

            cartasJugador.getCartasJugador(3);

            pedir = scanner.nextBoolean();
        }



        System.out.println("Final");
    }
}
