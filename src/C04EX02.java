import java.util.Scanner;


//Juan grochowski

public class C04EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        String cpf;
        String identidade;
        String tituloEleitor;
        String carteiraMotorista;
        String empresa;
        double salario;

        System.out.print("Digite seu primeiro nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite seu CPF: ");
        cpf = teclado.nextLine();

        System.out.print("Digite sua identidade: ");
        identidade = teclado.nextLine();

        System.out.print("Digite seu Titulo de eleitor: ");
        tituloEleitor = teclado.nextLine();

        System.out.print("Digite sua carteira de motorista: ");
        carteiraMotorista = teclado.nextLine();

        System.out.print("Digite sua empresa: ");
        empresa = teclado.nextLine();

        System.out.print("Digite seu salario: ");
        salario = teclado.nextDouble();


        System.out.println("FICHA FUNCIONAL DE: " + nome);
        System.out.println("Cpf............................................. " + cpf);
        System.out.println("Identidade............................................. " + identidade);
        System.out.println("Titulo de eleitor............................................. " + tituloEleitor);
        System.out.println("carteira de Motorista............................................. " + carteiraMotorista);
        System.out.println("empresa............................................. " + empresa);
        System.out.println("Salario............................................. " + salario);







        teclado.close();
    }
}