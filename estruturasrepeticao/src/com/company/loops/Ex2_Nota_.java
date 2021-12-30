package com.company.loops;

import java.util.Scanner;

public class Ex2_Nota_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        while(true){
            System.out.println("Digite uma nota valida(0 a 10): ");
            nota = scan.nextInt();
            if(nota >= 0 && nota <= 10)break;
        }
        System.out.println("Boa parabéns");


        //outra forma de fazer
        /*
        * while(nota < 0 | nota > 0) {
        *   sout   ("nota invalida")
        *   nota = scan.nextInt();
        * }
        * */

    }
}
