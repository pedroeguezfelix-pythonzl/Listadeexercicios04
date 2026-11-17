package org.example;

import java.util.Scanner;

public class Exercicio6lista04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] devido = new double[12];


        System.out.print("Digite o valor do empréstimo: ");
        double valor = sc.nextDouble();
        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxa = sc.nextDouble();
        for (int i = 0; i < devido.length; i++) {
            int mes = i + 1;
            devido[i] = valor + valor * taxa / 100 * mes;
        }
        for (int i = 0; i < devido.length; i++) {
            System.out.printf("Mês %d: R$ %.2f%n", i + 1, devido[i]);
        }
    }
}