package com.company;

public class SumaCartas {

    int sumaCartasJugador = 0;

    public void getSumaCartasJugador(int lengtCarta, int[] arrayQueSumar) {

        sumaCartasJugador = 0;
        for (int i = 0; i < lengtCarta  ; i++) {
            sumaCartasJugador = arrayQueSumar[i] + sumaCartasJugador;
        }
        System.out.println(" ("+sumaCartasJugador+")");

    }
}
