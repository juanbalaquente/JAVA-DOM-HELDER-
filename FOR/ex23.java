//Leia nota e faltas de 5 alunos e informe se cada um foi aprovado ou reprovado.

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int faltas, nota;

        // Verifica aprovação de 5 alunos
        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe o número de faltas: ");
            faltas = teclado.nextInt();

            System.out.print("Informe a nota: ");
            nota = teclado.nextInt();

            if (nota >= 60 && faltas <= 16) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }

        teclado.close();
    }
}