import javax.swing.JOptionPane;

//juan grochowski

public class C04EX04 {
    public static void main(String[] args) {
        // 1. Entrada de dados com prompts corrigidos
        String primeironome = JOptionPane.showInputDialog(null,
                "Digite seu primeiro nome:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        String nomemeio = JOptionPane.showInputDialog(null,
                "Digite seu nome do meio:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        String sobrenome = JOptionPane.showInputDialog(null,
                "Digite seu sobrenome:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        String idadeStr = JOptionPane.showInputDialog(null,
                "Digite sua idade:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        // 2. Conversão da idade
        int idade = Integer.parseInt(idadeStr);

        // 3. Exibição (Note o uso correto dos '+' e das vírgulas)
        JOptionPane.showMessageDialog(null,
                "Nome completo: " + primeironome + " " + nomemeio + " " + sobrenome +
                        "\nIdade: " + idade + " anos",
                "Resultado Final",
                JOptionPane.INFORMATION_MESSAGE);
    }
}