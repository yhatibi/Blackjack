package com.company;

public class CartasDealer {

    CartaRandom cartaRandom = new CartaRandom();
    int cartasPedidasDealer = 2;

    int cartaDealer []  = new int[cartasPedidasDealer];

    int carta1Dealer = cartaRandom.GenerarCarta();
    int carta2Dealer = cartaRandom.GenerarCarta();
    int sumaDealer = carta1Dealer + carta2Dealer;

    public void generarCartas() {
        for (int i = 0; i < cartasPedidasDealer ; i++) {
            cartaDealer[i] = cartaRandom.GenerarCarta();
        }
    }

    public void imprimirCartas( boolean levantarCarta) {
        System.out.println();
        System.out.println("Cartas del Dealer: ");
        for (int i = 0; i < cartasPedidasDealer ; i++) {
            System.out.print(cartaDealer[i]+" | ");
        }


//        if (levantarCarta == false) {
//            System.out.println("Cartas del Dealer: ");
//            System.out.println(carta1Dealer+" | # |  ("+carta1Dealer+")");
//        } else {
//            System.out.println("Cartas del Dealer: ");
//            System.out.println(carta1Dealer+" | "+carta2Dealer+ " |  ("+sumaDealer+")");
//        }

    }
}
