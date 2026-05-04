//Leia nome, cargo e salário de 5 funcionários e mostre quem tem o maior salário.

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, nomeMaior = "", cargo, cargoMaior = "";
        double salario, maiorSalario = 0;

        // Lê dados de 5 funcionários
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome do funcionário: ");
            nome = teclado.nextLine();

            System.out.print("Digite o cargo: ");
            cargo = teclado.nextLine();

            System.out.print("Digite o salário: ");
            salario = teclado.nextDouble();
            teclado.nextLine();

            if (i == 1 || salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaior = nome;
                cargoMaior = cargo;
            }
        }

        System.out.println("Funcionário com maior salário: " + nomeMaior);
        System.out.println("Cargo: " + cargoMaior);
        System.out.println("Salário mais alto: R$ " + maiorSalario);

        teclado.close();
    }
}