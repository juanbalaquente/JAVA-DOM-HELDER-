import java.util.Scanner;

// Juan Grochowski

public class C05EX10 {
    public static void main(String[] args) {
        int numero, d1, d2, d3, d4, d5;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Numero de 5 digitos: ");
        numero = teclado.nextInt();

        d1 = numero / 10000;
        d2 = numero / 1000 % 10;
        d3 = numero / 100 % 10;
        d4 = numero / 10 % 10;
        d5 = numero % 10;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

        teclado.close();
    }
}

//import java.util.Scanner;
//public class NumeroComTraco {
//   public static void main(String[] args) {
//      int numero, d1, d2, d3;
//      Scanner teclado = new Scanner(System.in);
//      System.out.print("Informe número inteiro de 3 dígitos: ");
//      numero = teclado.nextInt();
//      d1 = numero / 100;
//      d2 = numero / 10 % 10;
//      d3 = numero % 10;
//      System.out.println(d1+"-"+d2+"-"+d3);
//      teclado.close();
//   }
//}