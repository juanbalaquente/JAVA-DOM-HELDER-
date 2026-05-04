

import java.util.Scanner;
//juan grochowski

public class C06EX13 {
    public C06EX13() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a hora inicial do jogo: ");
        int horaInicio = sc.nextInt();
        System.out.print("Insira o minuto inicial do jogo: ");
        int minutoInicio = sc.nextInt();
        System.out.print("Insira a hora final do jogo: ");
        int horaFim = sc.nextInt();
        System.out.print("Insira o minuto final do jogo: ");
        int minutoFim = sc.nextInt();
        horaFim -= horaInicio;
        if (minutoInicio <= minutoFim) {
            minutoFim -= minutoInicio;
        } else {
            minutoFim = minutoFim + 60 - minutoInicio;
            --horaFim;
        }

        System.out.printf("O jogo durou %d horas e %d minutos.", horaFim, minutoFim);
        sc.close();
    }
}
