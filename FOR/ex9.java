//Leia 5 números e calcule a soma total.

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, soma = 0;

        // Soma os números lidos
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
            soma += numero;
        }

        System.out.println("Soma total: " + soma);
        teclado.close();
    }
}