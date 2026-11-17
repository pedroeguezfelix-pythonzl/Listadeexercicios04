package org.example;

import java.util.Scanner;

public class Exercicio7lista04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salarios = new double[6];
        double soma = 0;

        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = sc.nextDouble();
            soma += salarios[i];
        }

        double maior = salarios[0];
        double menor = salarios[0];
        for (int i = 1; i < salarios.length; i++) {
            if (salarios[i] > maior) {
                maior = salarios[i];
            }
            if (salarios[i] < menor) {
                menor = salarios[i];
            }
        }

        double media = soma / salarios.length;
        int acima = 0;
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > media) {
                acima++;
            }
        }

        System.out.printf("Maior salário: R$ %.2f%n", maior);
        System.out.printf("Menor salário: R$ %.2f%n", menor);
        System.out.printf("Média: R$ %.2f%n", media);
        System.out.println("O Funcionários acima da média: " + acima);
    }
}