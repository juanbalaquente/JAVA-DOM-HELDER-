//Leia 6 números e calcule a soma total.

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, soma = 0;

        // Soma 6 números digitados
        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
            soma += numero;
        }

        System.out.println("Soma: " + soma);
        teclado.close();
    }
}