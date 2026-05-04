import java.util.Scanner;

// Juan Grochowski

public class C05EX03 {
    public static void main(String[] args) {
        double salario, liquido, ir;
        int dependentes;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        salario = teclado.nextDouble();

        System.out.print("Digite o numero de dependentes: ");
        dependentes = teclado.nextInt();

        liquido = salario - (dependentes * 60);
        ir = liquido * 0.15;

        System.out.printf("IR = %.2f%n", ir);

        teclado.close();
    }
}