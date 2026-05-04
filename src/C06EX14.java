
import java.util.Scanner;

public class C06EX14 {
    public C06EX14() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trimHigh = 10000;
        int trimLow = 1000;
        System.out.print("Insira um número inteiro de quatro dígitos: ");
        int num = sc.nextInt();
        if (num < 10000) {
            for(int i = 0; i < 4; ++i) {
                num %= trimHigh;
                int aux = num / trimLow;
                trimHigh /= 10;
                trimLow /= 10;
                System.out.println(aux);
            }
        } else {
            System.out.print("NÚMERO TEM QUE TER 4 DÍGITOS");
        }

        sc.close();
    }
}
