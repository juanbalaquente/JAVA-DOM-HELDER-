import java.util.Scanner;

// Juan Grochowski

public class C05EX12 {
    public static void main(String[] args) {
        int horas, minutos, segundos, segundosRestantes;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos segundos durou: ");
        segundos = teclado.nextInt();

        horas = segundos / 3600;
        minutos = segundos % 3600 / 60;
        segundosRestantes = segundos % 60;

        System.out.println("hr = " + horas);
        System.out.println("min = " + minutos);
        System.out.println("seg = " + segundosRestantes);

        teclado.close();
    }
}