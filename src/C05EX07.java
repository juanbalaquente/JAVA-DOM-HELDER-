import java.util.Scanner;

// Juan Grochowski

public class C05EX07 {
    public static void main(String[] args) {
        double x;
        double resultado;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        x = teclado.nextDouble();

        resultado = Math.sqrt(Math.pow((x / 4.0) + 1, 2) + (1.0 / 5) * x);

        System.out.println("f(x) = " + resultado);

        teclado.close();
    }
}