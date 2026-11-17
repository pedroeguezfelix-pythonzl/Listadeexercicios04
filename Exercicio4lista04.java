package org.example;

import java.util.Scanner;

public class Exercicio4lista04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[5];
        double total = 0;

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            total += precos[i];

        }
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d: R$ %.2f%n", i + 1, precos[i]);
        }
        System.out.printf("Total da compra: R$ %.2f%n", total);
        int i = 21;

    }

}
