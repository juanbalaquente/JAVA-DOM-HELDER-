//Leia nome da cidade, população e eleitores de 4 cidades e mostre o percentual de eleitores.

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cidade;
        int populacao, eleitores;
        double percentual;

        // Calcula o percentual de eleitores por cidade
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite o nome da cidade: ");
            cidade = teclado.nextLine();

            System.out.print("Digite a população: ");
            populacao = teclado.nextInt();

            System.out.print("Digite a quantidade de eleitores: ");
            eleitores = teclado.nextInt();

            percentual = (eleitores * 100.0) / populacao;

            System.out.println("Cidade: " + cidade);
            System.out.println("Percentual de eleitores: " + percentual + "%");

            teclado.nextLine();
        }

        teclado.close();
    }
}