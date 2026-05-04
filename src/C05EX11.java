import java.util.Scanner;

// Juan Grochowski

public class C05EX11 {
    public static void main(String[] args) {
        int cheque, banco, agencia, sequencial;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Numero do cheque (9 digitos): ");
        cheque = teclado.nextInt();

        banco = cheque / 1000000;
        agencia = cheque / 1000 % 1000;
        sequencial = cheque % 1000;

        System.out.println("Banco = " + banco);
        System.out.println("Agencia = " + agencia);
        System.out.println("Sequencial = " + sequencial);

        teclado.close();
    }
}