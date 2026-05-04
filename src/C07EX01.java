import java.util.Scanner;

public class C07EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome do apostador: ");
        String nome = teclado.nextLine();

        System.out.print("Quantos jogos acertou (0-13)? ");
        int acertos = teclado.nextInt();

        switch (acertos) {
            case 0, 1, 2, 3, 4, 5 -> System.out.println(nome + " não ganhou nada.");
            case 6, 7, 8, 9, 10   -> System.out.println(nome + " ganhou outro cartão para apostar!");
            case 11                -> System.out.println(nome + " ganhou R$ 100,00!");
            case 12                -> System.out.println(nome + " ganhou R$ 1.000,00!");
            case 13                -> System.out.println(nome + " ganhou R$ 50.000,00!");
            default                -> System.out.println("Quantidade inválida. Informe entre 0 e 13.");
        }

        teclado.close();
    }
}