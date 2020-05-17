package com.company;

public class CartasDealer {

    CartaRandom cartaRandom = new CartaRandom();

    int carta1Dealer = cartaRandom.GenerarCarta();
    int carta2Dealer = cartaRandom.GenerarCarta();
    int sumaDealer = carta1Dealer + carta2Dealer;

    public void getCartaDealer(int cartasPedidasDealer) {

        System.out.println("Cartas del Dealer: ");
        System.out.println(carta1Dealer+",# ("+carta1Dealer+")");
        //System.out.println(carta1Dealer+","+carta2Dealer+ " ("+sumaDealer+")");

    }
}
