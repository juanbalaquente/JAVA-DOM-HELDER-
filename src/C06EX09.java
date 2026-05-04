import java.util.Scanner;
//juan grochowski

public class C06EX09 {
    public static void main(String[] args) {
        double altura, pesoIdeal;
        String sexo;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o sexo (F ou M): ");
        sexo = teclado.next();

        System.out.print("Digite a altura: ");
        altura = teclado.nextDouble();

        if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Peso ideal = " + pesoIdeal);
        } else if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Peso ideal = " + pesoIdeal);
        } else {
            System.out.println("Sexo invalido");
        }

        teclado.close();
    }
}