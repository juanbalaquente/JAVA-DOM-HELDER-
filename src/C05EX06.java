import java.util.Scanner;

// Juan Grochowski

public class C05EX06 {
    public static void main(String[] args) {
        double a, b, c, x, y;
        double distancia;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Reta R - A: ");
        a = teclado.nextDouble();

        System.out.print("Reta R - B: ");
        b = teclado.nextDouble();

        System.out.print("Reta R - C: ");
        c = teclado.nextDouble();

        System.out.print("Ponto P - X: ");
        x = teclado.nextDouble();

        System.out.print("Ponto P - Y: ");
        y = teclado.nextDouble();

        distancia = Math.abs(a * x + b * y + c / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));



        System.out.print("Distancia ="+ distancia);

        teclado.close();
    }
}