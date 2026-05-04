import java.util.Scanner;
//juan grochowski

public class C06EX06 {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        a = teclado.nextDouble();

        System.out.print("Digite o valor de B: ");
        b = teclado.nextDouble();

        System.out.print("Digite o valor de C: ");
        c = teclado.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Nao ha raizes reais");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("1 raiz = " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("2 raizes = " + x1 + " e " + x2);
        }

        teclado.close();
    }
}