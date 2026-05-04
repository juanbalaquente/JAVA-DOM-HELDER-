//Imprima um quadrado 5x5 com o símbolo *.

public class ex30v2 {
    public static void main(String[] args) {
        // Laço externo controla as linhas
        for (int linha = 1; linha <= 5; linha++) {
            // Laço interno controla as colunas
            for (int coluna = 1; coluna <= 5; coluna++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}