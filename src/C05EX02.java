import java.util.Scanner;
//juan grochowski

public class C05EX02 {
    public static void main(String[] args) {
        double R;
        double resultadoArea, resultadoVolume;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do RAIO: ");
        R = teclado.nextDouble();

        resultadoArea = Math.pow(R, 2) * Math.PI * 4;
        resultadoVolume = Math.pow(R, 3) * Math.PI * 4 / 3;

        System.out.println("area = " + resultadoArea);
        System.out.println("volume = " + resultadoVolume);

        teclado.close();
    }
}



//OU import java.util.Scanner;
//
/// / Juan Grochowski
//
//public class C05EX02 {
//    public static void main(String[] args) {
//        double R;
//        double resultadoArea, resultadoVolume;
//        final double PI = 3.1416;
//        Scanner teclado = new Scanner(System.in);
//
//        System.out.print("Digite o valor do raio: ");
//        R = teclado.nextDouble();
//
//        resultadoArea = 4 * PI * Math.pow(R, 2);
//        resultadoVolume = 4 * PI * Math.pow(R, 3) / 3;
//
//        System.out.println("Area = " + resultadoArea);
//        System.out.println("Volume = " + resultadoVolume);
//
//        teclado.close();
//    }
//}
//Math.PI