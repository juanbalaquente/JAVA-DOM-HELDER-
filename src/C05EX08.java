import java.util.Scanner;

// Juan Grochowski

public class C05EX08 {
    public static void main(String[] args) {
        double s, a;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de s: ");
        s = teclado.nextDouble();
        System.out.print("Digite o valor de a: ");
        a = teclado.nextDouble();

        double resultado = Math.sqrt((360 * s) / (a * 3.14));

        System.out.println("resultado= " + resultado);

        teclado.close();
    }
}