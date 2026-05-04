
import java.util.Scanner;
//juan grochowski

public class C06EX17 {
    public C06EX17() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o número de faltas do aluno: ");
        int faltas = sc.nextInt();
        System.out.print("Insira, respectivamente, as notas da primeira, segunda e terceira provas do aluno: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        System.out.print("Insira a nota do Trabalho Final: ");
        double trabalho = sc.nextDouble();
        System.out.print("Insira a idade do aluno: ");
        int idade = sc.nextInt();
        double media;
        if (nota1 > nota3 && nota2 > nota3) {
            media = (nota1 + nota2) / (double)2.0F;
        } else if (nota1 > nota2 && nota3 > nota2) {
            media = (nota1 + nota3) / (double)2.0F;
        } else {
            media = (nota2 + nota3) / (double)2.0F;
        }

        int peso1;
        if (faltas < 6) {
            peso1 = 3;
        } else if (faltas < 11) {
            peso1 = 2;
        } else {
            peso1 = 1;
        }

        int peso2;
        if (idade < 18) {
            peso2 = 1;
        } else if (idade < 51) {
            peso2 = 2;
        } else {
            peso2 = 3;
        }

        double notaFinal = media * (double)peso1 + trabalho * (double)peso2;
        String resultado;
        if (notaFinal <= (double)50.0F) {
            resultado = "Reprovado";
        } else if (notaFinal <= (double)70.0F) {
            resultado = "Regular";
        } else if (notaFinal <= (double)80.0F) {
            resultado = "Bom";
        } else if (notaFinal <= (double)90.0F) {
            resultado = "Muito bom";
        } else {
            resultado = "Excelente";
        }

        System.out.print(resultado);
        sc.close();
    }
}
