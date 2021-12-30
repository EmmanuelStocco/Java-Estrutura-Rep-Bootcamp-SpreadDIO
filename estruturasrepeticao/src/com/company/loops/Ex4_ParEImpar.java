package com.company.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeros;
        int continuar = 1;
        int quantPares = 0, quantImpares =0;


        do {
            System.out.println("Digite um numero: ");
            numeros = scan.nextInt();
            if(numeros % 2 == 0){
                quantPares = quantPares + 1;
            } else{
                quantImpares++;
            }

            System.out.println("Deseja continuar a operação? para parar digite 0");
            continuar = scan.nextInt();
        } while(continuar != 0);

        System.out.println("A quantiade de pares total é: " + quantPares);
        System.out.println("A quantiade de impares total é: " + quantImpares);

    }
}
