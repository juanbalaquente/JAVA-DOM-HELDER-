import java.util.Scanner;
import javax.swing.JOptionPane;
//juan grochowski

public class C04EX05 {
    public static void main(String[] args) {
        String nome, cpf, identidade, tituloEleitor, carteiraMotorista, empresa;
        double salario;

        Scanner arquivo = new Scanner(
                C04EX05.class.getResourceAsStream("ficha.txt"));

        nome = arquivo.nextLine();
        cpf = arquivo.nextLine();
        identidade = arquivo.nextLine();
        tituloEleitor = arquivo.nextLine();
        carteiraMotorista = arquivo.nextLine();
        salario = arquivo.nextDouble();
        arquivo.nextLine();
        empresa = arquivo.nextLine();

        String resultado = "FICHA FUNCIONAL DE: " + nome + "\n\n" +
                "Documentos:\n" +
                "CPF: " + cpf + "\n" +
                "C.I.: " + identidade + "\n" +
                "Titulo de eleitor: " + tituloEleitor + "\n" +
                "Carteira de motorista: " + carteiraMotorista + "\n\n" +
                "Empresa: " + empresa + "\n" +
                String.format("Salario: R$%.2f", salario);

        JOptionPane.showMessageDialog(null, resultado);

        arquivo.close();
    }
}