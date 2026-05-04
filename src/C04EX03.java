//import java.util.Scanner;
//
//public class C04EX03 {
//    public static void main(String[] args) {
//        double poluente;
//        double valorMulta;
//
//        Scanner teclado = new Scanner(System.in);
//
//        System.out.print("Digite a quantidade de poluente emitido: ");
//        poluente = teclado.nextDouble();
//
//        if (poluente <= 1500) {
//            // Até 1500
//            valorMulta = 1000.55;
//        } else if (poluente <= 3000) {
//            // De 1501 até 3000
//            valorMulta = 3550.34;
//        } else {
//            // Acima de 3000 (Multiplicação por unidade)
//            valorMulta = poluente * 1200.21;
//        }
//
//        System.out.printf("a quantidade de poluente produzido e: " + poluente + "o valor a ser pago e: " + valorMulta);
//
//        teclado.close();
//    }
//}
import java.util.Scanner;
//juan grochowski

public class C04EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double limite1, limite2;
        double multa1, multa2, multa3;

        System.out.print("Digite o primeiro limite de poluente: ");
        limite1 = teclado.nextDouble();

        System.out.print("Digite o segundo limite de poluente: ");
        limite2 = teclado.nextDouble();

        System.out.print("Digite o valor da primeira multa: ");
        multa1 = teclado.nextDouble();

        System.out.print("Digite o valor da segunda multa: ");
        multa2 = teclado.nextDouble();

        System.out.print("Digite o valor da terceira multa: ");
        multa3 = teclado.nextDouble();

        System.out.println("\nQuantidade de Poluente Emitido x Valor da Multa");
        System.out.printf("Até %.2f multa de R$%.2f%n", limite1, multa1);
        System.out.printf("Acima de %.2f até %.2f multa de R$%.2f%n", limite1, limite2, multa2);
        System.out.printf("Acima de %.2f multa de R$%.2f por poluente emitido%n", limite2, multa3);

        teclado.close();
    }
}



