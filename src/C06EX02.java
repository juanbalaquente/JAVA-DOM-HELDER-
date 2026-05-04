import java.util.Scanner;
//juan grochowski

public class C06EX02 {
    public static void main(String[] args) {
        double poluentes, multa;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de poluentes: ");
        poluentes = teclado.nextDouble();

        if (poluentes <= 1500) {
            multa = 0;
        } else if (poluentes <= 3500) {
            multa = 3000;
        } else {
            multa = poluentes * 5000;
        }

        System.out.printf("Multa = R$%.2f%n", multa);
        teclado.close();
    }
}