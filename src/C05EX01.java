import java.util.Scanner;
//juan grochowski

public class C05EX01 {
    public static void main(String[] args) {
        double x;
        double resultado;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        x = teclado.nextDouble();

        resultado = Math.pow(x, 3) + (4 * x) + 10;

        System.out.println("f(x) = " + resultado);

        teclado.close();
    }
}