package com.company.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int maior = 0;
        int soma = 0;


        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if(numero > maior) maior = numero;
            soma = soma + numero ;

            contador = contador + 1;
        } while (contador < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));

    }
}
