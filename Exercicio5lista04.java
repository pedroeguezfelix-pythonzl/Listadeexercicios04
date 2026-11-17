package org.example;

import java.util.Scanner;

public class Exercicio5lista04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[5];
        double[] comDesconto = new double[5];

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            comDesconto[i] = precos[i] * 0.9;
        }
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d: original R$ %.2f | com desconto R$ %.2f%n",
                    i + 1, precos[i], comDesconto[i]);
        }
    }
}

