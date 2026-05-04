import java.util.Scanner;
//juan grochowski

public class C06EX04 {
    public static void main(String[] args) {
        double peso, altura, imc;
        String nome, situacao;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite seu peso: ");
        peso = teclado.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = teclado.nextDouble();

        imc = peso / Math.pow(altura, 2);

        if (imc < 18) {
            situacao = "desnutrido";
        } else if (imc < 20) {
            situacao = "abaixo do peso";
        } else if (imc <= 25) {
            situacao = "no peso ideal";
        } else if (imc <= 27) {
            situacao = "acima do peso";
        } else {
            situacao = "obeso";
        }

        System.out.println(nome + " esta " + situacao);

        teclado.close();
    }
}