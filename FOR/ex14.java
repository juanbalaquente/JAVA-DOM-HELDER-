//Leia 5 números e calcule a soma total.

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, soma = 0;

        // Lê 5 números e acumula na soma
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
            soma += numero;
        }

        System.out.println("Soma total: " + soma);
        teclado.close();
    }
}