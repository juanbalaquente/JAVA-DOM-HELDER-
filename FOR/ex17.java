//Leia 10 números e conte quantos são divisíveis por 3.

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont = 0;

        // Conta os números divisíveis por 3
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();

            if (numero % 3 == 0) {
                cont++;
            }
        }

        System.out.println("Quantidade divisível por 3: " + cont);
        teclado.close();
    }
}