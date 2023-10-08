import javax.swing.JOptionPane;
import valor.Form;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog(null, "Nome: ");
        String idade = JOptionPane.showInputDialog(null, "Idade: ");
        String altura = JOptionPane.showInputDialog(null, "Altura: ");

        Form form = new Form(nome, idade, altura);

        form.retorno();

    }
}
