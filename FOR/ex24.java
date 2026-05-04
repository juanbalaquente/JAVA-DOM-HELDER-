//Leia preço de 5 postos e mostre a gasolina mais barata.

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valor, menorValor = 0;

        // Busca o menor preço
        for (int i = 1; i <= 5; i++) {
            System.out.print("Insira o valor da gasolina no posto " + i + ": ");
            valor = teclado.nextDouble();

            if (i == 1 || valor < menorValor) {
                menorValor = valor;
            }
        }

        System.out.println("Gasolina mais barata: R$ " + menorValor);
        teclado.close();
    }
}