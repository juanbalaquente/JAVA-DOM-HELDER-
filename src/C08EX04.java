//JUAN GROCHOWSKi
import java.util.Scanner;

public class C08EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int idade;
        int ate18 = 0;
        int acima18 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome: ");
            nome = teclado.nextLine();

            System.out.print("Digite a idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();

            if (idade <= 18) {
                ate18++;
            } else {
                acima18++;
            }
        }

        System.out.println("Ate 18 = " + ate18);
        System.out.println("Acima de 18 = " + acima18);

        teclado.close();
    }
}