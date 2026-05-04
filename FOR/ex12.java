//Leia o nome de 4 pessoas e mostre cada nome logo após a leitura.

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;

        // Lê e imprime 4 nomes
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite o nome: ");
            nome = teclado.nextLine();
            System.out.println("Nome lido: " + nome);
        }

        teclado.close();
    }
}