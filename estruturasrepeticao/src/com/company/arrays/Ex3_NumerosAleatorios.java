package com.company.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        //gera numeros aleatorios
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            //até 100
            int numero = random.nextInt( 100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Sucessores dos Numeros Aleatorios");
        for ( int numero : numerosAleatorios) {
            System.out.print( numero + " ");
        }

        System.out.println("Sucessores dos Numeros Aleatorios");
        for ( int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }

        System.out.println("Sucessores dos Numeros Aleatorios");
        for ( int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");
        }

    }
}
