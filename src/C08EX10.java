//JUAN GROCHOWSKi
import java.util.Scanner;

public class C08EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, nomeMaior = "";
        int qtdInsumos;
        double preco, custo, quantidadeConsumida, media, total = 0, maiorCusto = 0;

        System.out.print("Informe a quantidade de insumos: ");
        qtdInsumos = teclado.nextInt();
        teclado.nextLine();

        for (int i = 1; i <= qtdInsumos; i++) {
            System.out.print("Informe nome do insumo: ");
            nome = teclado.nextLine();

            System.out.print("Informe preco do insumo: ");
            preco = teclado.nextDouble();

            System.out.print("Quantidade consumida: ");
            quantidadeConsumida = teclado.nextDouble();
            teclado.nextLine();

            custo = preco * quantidadeConsumida;

            total += custo;

            if (custo > maiorCusto) {
                maiorCusto = custo;
                nomeMaior = nome;
            }
        }

        media = total / qtdInsumos;

        System.out.println();
        System.out.println("Custo total do projeto = " + total);
        System.out.println("Media dos custos parciais = " + media);
        System.out.println("Insumo de maior custo parcial = " + nomeMaior);

        teclado.close();
    }
}