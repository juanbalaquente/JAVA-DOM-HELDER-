//JUAN GROCHOWSKi
import java.util.Scanner;

public class C08EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota;
        int faltas;
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 1; i <= 50; i++) {
            System.out.print("Digite a nota final: ");
            nota = teclado.nextDouble();

            System.out.print("Digite a quantidade de faltas: ");
            faltas = teclado.nextInt();

            if (nota >= 65 && faltas <= 16) {
                System.out.println("ALUNO APROVADO");
                aprovados++;
            } else {
                System.out.println("ALUNO REPROVADO");
                reprovados++;
            }
        }

        System.out.println("Aprovados = " + aprovados);
        System.out.println("Reprovados = " + reprovados);

        teclado.close();
    }
}