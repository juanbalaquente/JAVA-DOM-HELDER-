import java.util.Scanner;

public class C07EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe seu Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Valor do imposto ");
        int valor = teclado.nextInt();
        System.out.print("Dias em atraso ");
        int dias = teclado.nextInt();

        switch (dias) {
            case 0, 1, 2, 3, 4, 5 -> System.out.println(nome + " Imposto isento ");
            case 6, 7, 8 -> System.out.println(nome + " o imposto e de " + valor * 0.02);
            case 9,10                -> System.out.println(nome + " o imposto e de " + (valor * 0.10 + valor * 0.005 * dias));
            default                -> System.out.println(nome + " o imposto e de " + (valor * 1.50 + 1.0 * dias));
        }

        teclado.close();
    }
}