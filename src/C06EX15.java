
import java.util.Scanner;
//juan grochowski

public class C06EX15 {
    public C06EX15() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o código do pacote: ");
        int codigo = sc.nextInt();
        System.out.print("Insira a quantidade de dias que usou serviços pay-per-view: ");
        int qtdDias = sc.nextInt();
        System.out.print("Insira o valor dos serviços extras: ");
        double extras = sc.nextDouble();
        sc.nextLine();
        System.out.print("Insira sua cidade: ");
        String cidade = sc.nextLine();
        double imposto;
        if (cidade.equalsIgnoreCase("Belo Horizonte")) {
            imposto = (double)1.0F;
        } else if (!cidade.equalsIgnoreCase("São Paulo") && !cidade.equalsIgnoreCase("sao paulo")) {
            if (cidade.equalsIgnoreCase("rio de janeiro")) {
                imposto = 1.015;
            } else {
                imposto = 1.02;
            }
        } else {
            imposto = 1.01;
        }

        double valorFixo;
        double ppv;
        if (codigo == 1) {
            valorFixo = (double)65.0F;
            ppv = 1.2 * (double)qtdDias;
            if (ppv > (double)65.0F) {
                ppv = (double)65.0F;
            }
        } else if (codigo == 2) {
            valorFixo = (double)104.0F;
            ppv = 2.1 * (double)qtdDias;
        } else {
            valorFixo = (double)137.0F;
            ppv = (double)0.0F;
        }

        double conta = (valorFixo + ppv + extras) * imposto;
        System.out.printf("Conta: %.2f", conta);
        sc.close();
    }
}
