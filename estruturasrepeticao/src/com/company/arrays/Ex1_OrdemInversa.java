package com.company.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {-5, -6, 15, 50, 8};
        //array comeca na posicao 0
        int count = 0;

        //lenght comeca na posição 1
        while(count < (vetor.length-1)){
            System.out.println(vetor[count]);
            count++;
        }
        System.out.println("\nVetor:");
        //pegando a ordem inversa
        for(int i = (vetor.length -1) ; i >= 0; i--){
            System.out.println(vetor[i] + "");
        }
    }
}
