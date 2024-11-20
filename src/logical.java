import javax.swing.JOptionPane;

public class logical {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("iNSIRA SEU NOME: ");
        JOptionPane.showMessageDialog(null, "Olá " + name);

        int idade = Integer.parseInt(JOptionPane.showInputDialog("iNSIRA SEU NOME: "));
        JOptionPane.showMessageDialog(null, "Você tem " + idade+ " anos");

    }
}
