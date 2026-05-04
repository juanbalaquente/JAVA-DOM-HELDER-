//Faça um programa que leia exatamente 5 números e imprima cada número lido.

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Repetição definida com 5 leituras
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            double num = teclado.nextDouble();
            System.out.println("Número lido: " + num);
        }

        teclado.close();
    }
}