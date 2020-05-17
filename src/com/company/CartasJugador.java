package com.company;

public class CartasJugador {

    CartaRandom cartaRandom = new CartaRandom();

    int carta1Jugador = cartaRandom.GenerarCarta();
    int carta2Jugador = cartaRandom.GenerarCarta();
    int sumaJugador = carta1Jugador + carta2Jugador;

    public void getCartasJugador(int cartasPedidasJugador) {

        
        System.out.println("Tus cartas:");
        System.out.println(carta1Jugador+","+carta2Jugador+ " ("+sumaJugador+")");
    }
}
