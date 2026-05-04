//JUAN GROCHOWSKi
import java.util.Scanner;

public class testec8e4 {
    public static void main(String[] args) {
        double a = 37;
        double b = 38;
        double c = 1;
        double serie = 0;

        for (int i = 1; i <= 37; i++) {
            serie += (a * b) / c;

            a--;
            b--;
            c++;
        }

        System.out.println("Valor da Série = " + serie);}
    }