//JUAN GROCHOWSKi
import java.util.Scanner;

public class C08EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota;
        int faltas;

        for (int i = 1; i <= 50; i++) {
            System.out.print("Digite a nota final: ");
            nota = teclado.nextDouble();

            if (nota == -1) {
                break;
            }

            System.out.print("Digite a quantidade de faltas: ");
            faltas = teclado.nextInt();

            if (nota >= 65 && faltas <= 16) {
                System.out.println("ALUNO APROVADO");
            } else {
                System.out.println("ALUNO REPROVADO");
            }
        }

        teclado.close();
    }
}