package com.company;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartasDealer cartasDealer = new CartasDealer();
        CartasJugador cartasJugador = new CartasJugador();

        //Mostrar Cartas
        cartasDealer.getCartaDealer();
        cartasJugador.getCartasJugador();

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
