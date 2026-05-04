// JUAN GROCHOWSKI
import java.util.Scanner;

// Imprima:
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

public class ex30 {
    public static void main(String[] args) {

        // Este primeiro for controla as LINHAS.
        // aux2 começa em 1 e vai até 5.
        // Cada valor de aux2 representa uma linha da saída.
        for (int aux2 = 1; aux2 <= 5; aux2++) {

            // Este segundo for controla os NÚMEROS dentro de cada linha.
            // aux começa em 1 e vai até aux2.
            //
            // Exemplo:
            // Se aux2 vale 1, imprime: 1
            // Se aux2 vale 2, imprime: 1 2
            // Se aux2 vale 3, imprime: 1 2 3
            for (int aux = 1; aux <= aux2; aux++) {

                // Imprime o valor de aux na mesma linha.
                // O " " serve para dar espaço entre os números.
                //
                // Usamos print, e não println,
                // porque queremos os números lado a lado.
                System.out.print(aux + " ");
            }

            // Depois que o segundo for termina,
            // significa que a linha atual acabou.
            //
            // Este println vazio serve para pular para a próxima linha.
            System.out.println();
        }
    }
}

////Imprima um quadrado 5x5 com o símbolo *.
//
//public class ex30 {
//    public static void main(String[] args) {
//        // Laço externo controla as linhas
//        for (int linha = 1; linha <= 5; linha++) {
//            // Laço interno controla as colunas
//            for (int coluna = 1; coluna <= 5; coluna++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}