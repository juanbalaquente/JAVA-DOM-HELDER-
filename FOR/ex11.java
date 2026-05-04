//Faça um programa que mostre quantas vezes um for de 1 até 50 executa.

public class ex11 {
    public static void main(String[] args) {
        int cont = 0;

        // Conta quantas vezes o laço executa
        for (int i = 1; i <= 50; i++) {
            cont++;
        }

        System.out.println("Quantidade de repetições: " + cont);
    }
}