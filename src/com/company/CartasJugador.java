package com.company;

public class CartasJugador {

    CartaRandom cartaRandom = new CartaRandom();
    int cartasPedidasJugador = 2;
    int cartaJugador []  = new int[cartasPedidasJugador];

    public void generarCartas() {

        for (int i = 0; i < cartasPedidasJugador ; i++) {
            cartaJugador[i] = cartaRandom.GenerarCarta();
        }
    }

    public void imprimirCartas() {
        System.out.println();
        System.out.println("Tus Cartas: ");

        for (int i = 0; i < cartasPedidasJugador ; i++) {
            System.out.print(cartaJugador[i]+" | ");
        }
    }
}
