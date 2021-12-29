package com.company;

public class ExercicioControle {

    public static void main(String[] args) {

        int i1 = 30;
        int i2 = 20;

        if (i1 <= i2){
            System.out.println("i1 é menor q i2 ou igual");
        } else {
            System.out.println("i1 é maior q i2");

        };

        switchSemana();

    }

    private static void switchSemana(){
        String dia = "Segunda";

        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terca":
                System.out.println(3);
                break;
        }

    }


}
