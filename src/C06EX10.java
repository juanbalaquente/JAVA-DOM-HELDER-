import java.util.Scanner;
//juan grochowski

public class C06EX10 {
    public static void main(String[] args) {
        double capital, dias, taxapercentual,taxa, rendimento, ir, valorresgatado;

        Scanner teclado = new Scanner(System.in);


        System.out.print("Digite o capital: ");
        capital = teclado.nextDouble();
        System.out.print("DIAS: ");
        dias = teclado.nextDouble();
        System.out.print("TAXA DIARIA: ");
        taxapercentual = teclado.nextDouble();

        taxapercentual = taxapercentual / 100;

        rendimento = capital * taxapercentual * dias;
        ir = rendimento * 0.15;
        valorresgatado = capital + rendimento - ir - 10;


        System.out.printf("Rendimento = R$%.2f%n", rendimento);
        System.out.printf("Imposto de Renda = R$%.2f%n", ir);
        System.out.printf("Valor Resgatado = R$%.2f%n", valorresgatado);



        teclado.close();
    }
}