
import java.util.Scanner;
//juan grochowski

public class C06EX12 {
    public C06EX12() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de bolas produzidas: ");
        long qtdBolas = sc.nextLong();
        System.out.print("Insira a quantidade de bolas descartadas: ");
        long qtdPerda = sc.nextLong();
        System.out.print("Insira o preço unitário das caixas de papelão: R$");
        double precoCaixa = sc.nextDouble();
        System.out.print("Insira a quantidade de meses até a Copa: ");
        long meses = sc.nextLong();
        System.out.print("Insira o preço do aluguel mensal de cada estocagem: R$");
        double aluguel = sc.nextDouble();
        qtdBolas -= qtdPerda;
        aluguel *= (double)meses;
        double qtdCaixa = Math.ceil((double)qtdBolas / (double)10.0F);
        double qtdGalpao = Math.ceil(qtdCaixa / (double)850.0F);
        precoCaixa *= qtdCaixa;
        aluguel *= qtdGalpao;
        double custoTotal = aluguel + precoCaixa;
        System.out.printf("Custo total: R$%.2f", custoTotal);
        sc.close();
    }
}
