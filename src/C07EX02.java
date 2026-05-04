import java.util.Scanner;

public class C07EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.print("Nota 1 (0-10)? ");
        int N1 = teclado.nextInt();
        System.out.print("Nota 2 (0-10)? ");
        int N2 = teclado.nextInt();
        System.out.print("Nota 3 (0-10)? ");
        int N3 = teclado.nextInt();
        int nota = (N1 + N2 + N3) / 3;

        switch (nota) {
            case 0, 1, 2, 3, 4 -> System.out.println(nome + " Nota E");
            case 5,6   -> System.out.println(nome + " Nota D");
            case 7                -> System.out.println(nome + " Nota C");
            case 8                -> System.out.println(nome + " Nota B");
            case 9,10                -> System.out.println(nome + " Nota A");
            default                -> System.out.println("Nota inválida. Informe entre 0 e 10.");
        }

        teclado.close();
    }
}