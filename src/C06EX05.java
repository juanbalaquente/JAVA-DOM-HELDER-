import java.util.Scanner;
//juan grochowski

public class C06EX05 {
    public static void main(String[] args) {
         int num;


        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        num = teclado.nextInt();

        if (num % 5 == 0 && num % 7 == 0) {
            System.out.print(num + " e divisivel por 5 & 7 ");
        } else {
            System.out.print(num + " nao divisivel por 5 & 7 ");
        }


        teclado.close();
    }
}