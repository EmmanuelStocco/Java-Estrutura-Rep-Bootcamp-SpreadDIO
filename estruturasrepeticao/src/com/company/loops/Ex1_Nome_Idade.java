package com.company.loops;

import java.util.Scanner;

public class Ex1_Nome_Idade {
    public static void main(String[] args) {
        //classe para ler valores do teclado
        Scanner scan = new Scanner(System.in);

        //definimos as variaveis que serão usadas
        String nome;
        int idade;

        while(true) {

            //atribuindo o valor do que for digitado a nossas var
            System.out.println("Nome: " );
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: " );
            idade = scan.nextInt();
            System.out.println("Seu nome é: " + nome + " e sua idade é: " + idade);
        }

        System.out.println("Boa parabéns");
    }
}
