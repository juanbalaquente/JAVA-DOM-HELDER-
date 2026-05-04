//JUAN GROCHOWSKi
import java.util.Scanner;

public class C08EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double raio, area;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o raio: ");
            raio = teclado.nextDouble();
            area = 3.1416 * Math.pow(raio, 2);
            System.out.println("A area e " + area);
        }

        teclado.close();
    }
}