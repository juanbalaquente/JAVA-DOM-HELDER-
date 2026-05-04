import java.util.Scanner;
//juan grochowski

public class C06EX08 {
    public static void main(String[] args) {
        String nome;
        double altura, pesoMinimo, pesoMaximo;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite a altura: ");
        altura = teclado.nextDouble();

        pesoMinimo = 20 * Math.pow(altura, 2);
        pesoMaximo = 25 * Math.pow(altura, 2);

        System.out.println("Pessoa: " + nome);
        System.out.printf("Peso minimo = %.2f%n", pesoMinimo);
        System.out.printf("Peso maximo = %.2f%n", pesoMaximo);

        teclado.close();
    }
}