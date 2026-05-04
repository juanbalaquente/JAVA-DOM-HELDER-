import java.util.Scanner;


//Juan grochowski

public class C04EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String primeiroNome;
        String nomeDoMeio;
        String sobrenome;
        int idade;

        System.out.print("Digite seu primeiro nome: ");
        primeiroNome = teclado.nextLine();

        System.out.print("Digite seu nome do meio: ");
        nomeDoMeio = teclado.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();

        System.out.println(sobrenome + ", " + primeiroNome + " " + nomeDoMeio);
        System.out.println("Idade: " + idade + " anos.");

        teclado.close();
    }
}