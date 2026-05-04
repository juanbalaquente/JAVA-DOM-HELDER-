import java.util.Scanner;

// Juan Grochowski

public class C05EX04 {
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        double distancia;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ponto 1 - x1: ");
        x1 = teclado.nextDouble();

        System.out.print("Ponto 1 - y1: ");
        y1 = teclado.nextDouble();

        System.out.print("Ponto 2 - x2: ");
        x2 = teclado.nextDouble();

        System.out.print("Ponto 2 - y2: ");
        y2 = teclado.nextDouble();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.print("Distancia ="+ distancia);

        teclado.close();
    }
}