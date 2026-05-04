//Leia 6 números e conte quantos são positivos.

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont = 0;

        // Conta números positivos
        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite um número: ");
            int num = teclado.nextInt();

            if (num > 0) {
                cont++;
            }
        }

        System.out.println("Quantidade de números positivos: " + cont);
        teclado.close();
    }
}