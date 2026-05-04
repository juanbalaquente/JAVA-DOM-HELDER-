import java.util.Scanner;
//juan grochowski

public class C06EX11 {
    public static void main(String[] args) {
        String equipe1, equipe2;
        int sets1, sets2, pontos1 = 0, pontos2 = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome da equipe 1: ");
        equipe1 = teclado.nextLine();

        System.out.print("Digite o nome da equipe 2: ");
        equipe2 = teclado.nextLine();

        System.out.print("Sets da equipe 1: ");
        sets1 = teclado.nextInt();

        System.out.print("Sets da equipe 2: ");
        sets2 = teclado.nextInt();

        if (sets1 == 3 && (sets2 == 0 || sets2 == 1)) {
            pontos1 = 3;
            pontos2 = 0;
        } else if (sets2 == 3 && (sets1 == 0 || sets1 == 1)) {
            pontos1 = 0;
            pontos2 = 3;
        } else if (sets1 == 3 && sets2 == 2) {
            pontos1 = 2;
            pontos2 = 1;
        } else if (sets2 == 3 && sets1 == 2) {
            pontos1 = 1;
            pontos2 = 2;
        }

        System.out.println("Pontos " + equipe1 + " = " + pontos1);
        System.out.println("Pontos " + equipe2 + " = " + pontos2);

        teclado.close();
    }
}