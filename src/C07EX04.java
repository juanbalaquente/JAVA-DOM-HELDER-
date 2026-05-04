import java.util.Scanner;

public class C07EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe seu TIME: ");
        String time = teclado.nextLine();

        switch (time) {
            case "América", "Atlético", "Cruzeiro", "Villa Nova" -> System.out.println(" MINAS GERAIS ");
            case "Botafogo", "Flamengo", "Fluminense", "Vasco" -> System.out.println(" RIO DE JANEIRO ");
            case "Corinthians", "Palmeiras", "Santos", "São Paulo"-> System.out.println(" SAO PAULO ");
            case "Grêmio", "Internacional", "Juventude"               -> System.out.println(" RIO GRANDE DO SUL ");
            case "Náutico", "Santa Cruz", "Sport"               -> System.out.println(" PERNAMBUCO ");

            default -> System.out.println(" OPCAO INVALIDA");
        }

        teclado.close();
    }
}