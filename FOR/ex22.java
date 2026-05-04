//Leia nome e idade de 5 pessoas e calcule a média das idades.

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade, soma = 0;
        double media;

        // Soma as idades para depois calcular a média
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa: ");
            idade = teclado.nextInt();
            soma += idade;
        }

        media = soma / 5.0;
        System.out.println("Média das idades: " + media);

        teclado.close();
    }
}