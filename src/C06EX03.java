import java.util.Scanner;
//juan grochowski

public class C06EX03 {
    public static void main(String[] args) {
        double vendas, comissao = 0;
        double salario = 240;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor das vendas: ");
        vendas = teclado.nextDouble();

        if (vendas <= 1000) {
            comissao = 0;
        } else if (vendas <= 10000) {
            comissao = vendas * 0.10;
        } else {
            comissao = 1000;
        }

        salario = 240 + comissao;

        System.out.printf("Salario = R$%.2f%n", salario);

        teclado.close();
    }
}