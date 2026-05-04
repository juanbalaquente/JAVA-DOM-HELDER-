//Leia 10 números, mas interrompa a repetição se o usuário digitar 100.

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Laço com break
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            int num = teclado.nextInt();

            if (num == 100) {
                break;
            }
        }

        teclado.close();
    }
}