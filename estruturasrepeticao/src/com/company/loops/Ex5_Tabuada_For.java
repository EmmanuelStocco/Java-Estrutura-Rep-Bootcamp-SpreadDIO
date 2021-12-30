package com.company.loops;

import java.util.Scanner;

public class Ex5_Tabuada_For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada do: ");
        int tabuada = scan.nextInt();

        for( int i = 1 ; i <= 10 ; i++ ){
            int resultado = tabuada * i;
            System.out.println(tabuada + " X " + i + " = " + resultado );
        }
    }
}
