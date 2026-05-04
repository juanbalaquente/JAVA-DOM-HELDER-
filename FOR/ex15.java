//Leia 10 números e conte quantos são maiores que 50.

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, cont = 0;

        // Conta quantos números são maiores que 50
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();

            if (numero > 50) {
                cont++;
            }
        }

        System.out.println("Quantidade de números maiores que 50: " + cont);
        teclado.close();
    }
}