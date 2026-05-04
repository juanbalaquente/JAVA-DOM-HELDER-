import java.util.Scanner;

//juangrochowski

public class C06EX07 {
    public static void main(String[] args) {
        double salario, plBruto, ir, plLiquido;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        salario = teclado.nextDouble();

        if (salario <= 300) {
            plBruto = 500 + salario * 0.7;
        } else if (salario <= 1000) {
            plBruto = 200 + salario * 0.5;
        } else {
            plBruto = salario * 0.3;
        }

        ir = plBruto * 0.25;
        plLiquido = plBruto - ir;

        System.out.printf("PL Liquido = R$%.2f%n", plLiquido);

        teclado.close();
    }
}