//Leia 5 números e descubra qual é o maior.

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, maior = 0;

        // Guarda o maior valor lido
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();

            if (i == 1 || numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Maior número: " + maior);
        teclado.close();
    }
}