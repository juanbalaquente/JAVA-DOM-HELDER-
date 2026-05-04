//Leia 5 números e descubra qual é o maior.

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, maior = 0;

        // Busca o maior número
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