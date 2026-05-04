//Leia nome e salário de 4 pessoas e mostre o nome de quem tem maior salário.

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, nomeMaior = "";
        double salario, maiorSalario = 0;

        // Lê nome e salário de 4 pessoas
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite o nome da pessoa: ");
            nome = teclado.nextLine();

            System.out.print("Digite o salário: ");
            salario = teclado.nextDouble();
            teclado.nextLine();

            if (i == 1 || salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaior = nome;
            }
        }

        System.out.println("Pessoa com maior salário: " + nomeMaior);
        System.out.println("Maior salário: R$ " + maiorSalario);
        teclado.close();
    }
}