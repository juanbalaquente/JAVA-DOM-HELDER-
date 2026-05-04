//Faça dois programas: um que leia exatamente 5 números e outro que leia números até o usuário digitar 0.

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Repetição definida: lê exatamente 5 números
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            double num = teclado.nextDouble();
            System.out.println("Você digitou: " + num);
        }

        teclado.close();
    }
}