package org.example;

import java.util.Scanner;

public class Exercicio10lista04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de itens da compra: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Quantidade inválida.");
            return;
        }
        double[] precos = new double[n];
        int[] quantidades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Preço unitário do item " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            System.out.print("Quantidade do item " + (i + 1) + ": ");
            quantidades[i] = sc.nextInt();
        }
        double total = 0;
        for (int i = 0; i < n; i++) {
            double subtotal = precos[i] * quantidades[i];
            System.out.printf("Item %d: R$ %.2f%n", i + 1, subtotal);
            total += subtotal;
        }
        double desconto = 0;
        if (total > 200) {
            desconto = total * 0.05;
        }
        double valorFinal = total - desconto;

        System.out.printf("Total da compra: R$ %.2f%n", total);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final que precisa pagar: R$ %.2f%n", valorFinal);
    }
}
