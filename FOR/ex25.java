//Leia nome, quantidade e preço de 3 insumos e calcule o custo total.

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int quantidade;
        double preco, custo, total = 0;

        // Calcula o custo parcial de cada insumo e soma no total
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o nome do insumo: ");
            nome = teclado.nextLine();

            System.out.print("Digite a quantidade: ");
            quantidade = teclado.nextInt();

            System.out.print("Digite o preço: ");
            preco = teclado.nextDouble();

            custo = quantidade * preco;
            total += custo;

            teclado.nextLine();
        }

        System.out.println("Custo total: R$ " + total);
        teclado.close();
    }
}