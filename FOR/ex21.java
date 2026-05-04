//Leia 8 números e, para cada um, mostre se é positivo, negativo ou zero.

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Classifica cada número lido
        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();

            if (numero > 0) {
                System.out.println("Positivo");
            } else if (numero < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }

        teclado.close();
    }
}