//JUAN GROCHOWSKi
import java.util.Scanner;

public class C08EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int voto;
        int fulano = 0;
        int ciclano = 0;
        int beltrano = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o numero do candidato: ");
            voto = teclado.nextInt();

            if (voto == 1) {
                fulano++;
            } else if (voto == 2) {
                ciclano++;
            } else if (voto == 3) {
                beltrano++;
            }
        }

        System.out.println("Votos de Fulano = " + fulano);
        System.out.println("Votos de Ciclano = " + ciclano);
        System.out.println("Votos de Beltrano = " + beltrano);

        if (fulano > ciclano && fulano > beltrano) {
            System.out.println("Vencedor = Fulano");
        } else if (ciclano > fulano && ciclano > beltrano) {
            System.out.println("Vencedor = Ciclano");
        } else {
            System.out.println("Vencedor = Beltrano");
        }

        teclado.close();
    }
}