package com.company;

import java.util.Random;

public class CartaRandom {

    String carta [] = { "1","2","3","4","5","6","7","8","9","10","10","10"};
 
    public void GenerarCarta() {
        //Generar una Carta [A=1, J=10, Q=10, K=10]

        Random random = new Random();
        int x = random.nextInt(12);
        System.out.println(carta[x]);


    }
}
