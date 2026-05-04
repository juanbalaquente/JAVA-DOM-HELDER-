//Imprima a sequência 1, 2, 4, 8, 16, 32 usando repetição.

public class ex29 {
    public static void main(String[] args) {
        int valor = 1;

        // Multiplica por 2 a cada repetição
        for (int i = 1; i <= 6; i++) {
            System.out.println(valor);
            valor = valor * 2;
        }
    }
}