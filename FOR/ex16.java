//Leia 5 números e, para cada um, mostre se é par ou ímpar.

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Verifica par ou ímpar em cada entrada
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Número par: " + numero);
            } else {
                System.out.println("Número ímpar: " + numero);
            }
        }

        teclado.close();
    }
}