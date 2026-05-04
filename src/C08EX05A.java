//JUAN GROCHOWSKi
import java.util.Scanner;

public class C08EX05A {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int voto;
        int fulano = 0;
        int ciclano = 0;
        int beltrano = 0;
        int nulo = 0;
        int validos;
        int fulano2 = 0;
        int ciclano2 = 0;
        int beltrano2 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o numero do candidato: ");
            voto = teclado.nextInt();

            if (voto == 1) {
                fulano++;
            } else if (voto == 2) {
                ciclano++;
            } else if (voto == 3) {
                beltrano++;
            } else {
                nulo++;
            }
        }

        validos = fulano + ciclano + beltrano;

        System.out.println("Votos de Fulano = " + fulano);
        System.out.println("Votos de Ciclano = " + ciclano);
        System.out.println("Votos de Beltrano = " + beltrano);
        System.out.println("Votos Nulos = " + nulo);
        System.out.println("Votos validos = " + validos);

        if (nulo > validos) {
            System.out.println("ELEICAO ANULADA");
        } else {
            if (fulano > ciclano && fulano > beltrano) {
                System.out.println("O VENCEDOR E: FULANO");
            } else if (ciclano > fulano && ciclano > beltrano) {
                System.out.println("O VENCEDOR E: CICLANO");
            } else if (beltrano > fulano && beltrano > ciclano) {
                System.out.println("O VENCEDOR E: BELTRANO");
            } else {
                if (fulano == ciclano && ciclano == beltrano) {
                    System.out.println("EMPATE TRIPLO: Fulano, Ciclano e Beltrano vao para o segundo turno");
                } else if (fulano == ciclano && fulano > beltrano) {
                    System.out.println("EMPATE: Fulano e Ciclano vao para o segundo turno");
                    System.out.println("SEGUNDO TURNO: 1-Fulano / 2-Ciclano");

                    for (int i = 0; i < 10; i++) {
                        System.out.print("Digite o voto do segundo turno: ");
                        voto = teclado.nextInt();

                        if (voto == 1) {
                            fulano2++;
                        } else if (voto == 2) {
                            ciclano2++;
                        }
                    }

                    System.out.println("Votos Fulano segundo turno = " + fulano2);
                    System.out.println("Votos Ciclano segundo turno = " + ciclano2);

                    if (fulano2 > ciclano2) {
                        System.out.println("VENCEDOR DO SEGUNDO TURNO: FULANO");
                    } else {
                        System.out.println("VENCEDOR DO SEGUNDO TURNO: CICLANO");
                    }
                } else if (fulano == beltrano && fulano > ciclano) {
                    System.out.println("EMPATE: Fulano e Beltrano vao para o segundo turno");
                } else if (ciclano == beltrano && ciclano > fulano) {
                    System.out.println("EMPATE: Ciclano e Beltrano vao para o segundo turno");
                }
                System.out.println("EMPATE: Fulano e Beltrano vao para o segundo turno");
                System.out.println("SEGUNDO TURNO: 1-Fulano / 3-Beltrano");

                for (int i = 0; i < 10; i++) {
                    System.out.print("Digite o voto do segundo turno: ");
                    voto = teclado.nextInt();

                    if (voto == 1) {
                        fulano2++;
                    } else if (voto == 3) {
                        beltrano2++;
                    }
                }

                if (fulano2 > beltrano2) {
                    System.out.println("VENCEDOR DO SEGUNDO TURNO: FULANO");
                } else {
                    System.out.println("VENCEDOR DO SEGUNDO TURNO: BELTRANO");
                }
            }
        }

        teclado.close();
    }
}