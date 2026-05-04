import java.util.Scanner;

// Juan Grochowski

public class C05EX09 {
    public static void main(String[] args) {
        double n1, n2, n3;
        Scanner teclado = new Scanner(System.in);

        System.out.print("NOTA 1 : ");
        n1 = teclado.nextDouble();
        System.out.print("NOTA 2: ");
        n2 = teclado.nextDouble();
        System.out.print("NOTA 3: ");
        n3 = teclado.nextDouble();

        double resultado =(n1 * 2 + n2 * 3 + n3 * 5) / 10;

        System.out.println("resultado= " + resultado);

        teclado.close();
    }
}