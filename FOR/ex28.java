//Leia um número e imprima a tabuada dele de 1 a 10.

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o número: ");
        int num1 = teclado.nextInt();

        // Monta a tabuada do número digitado
        for (int i = 1; i <= 10; i++) {
            int valorfinal = num1 * i;
            System.out.println(num1 + " x " + i + " = " + valorfinal);
        }

        teclado.close();
    }
}