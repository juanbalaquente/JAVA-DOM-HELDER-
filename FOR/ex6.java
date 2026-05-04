//Faça um laço que leia 3 notas; para cada uma, mostre a nota e se ela é maior ou igual a 60.

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a nota: ");
            int nota = teclado.nextInt();

            System.out.println("Nota digitada: " + nota);

            if (nota >= 60) {
                System.out.println("Nota maior ou igual a 60");
            } else {
                System.out.println("Nota menor que 60");
            }
        }

        teclado.close();
    }
}