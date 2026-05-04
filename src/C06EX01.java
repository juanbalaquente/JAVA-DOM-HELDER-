import java.util.Scanner;
//juan grochowski

public class C06EX01 {
    public static void main(String[] args) {
        double numero, resultado;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        numero = teclado.nextDouble();

        if (numero < 4) {
            resultado = (5 * numero + 3) / Math.sqrt(16 - Math.pow(numero, 2));
        } else if (numero == 4) {
            resultado = 0;
        } else {
            resultado = (5 * numero + 3) / Math.sqrt(Math.pow(numero, 2) - 16);
        }

        System.out.println("f(x) = " + resultado);

        teclado.close();
    }
}