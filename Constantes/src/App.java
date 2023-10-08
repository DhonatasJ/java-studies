import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {q
        Scanner scanner = new Scanner(System.in);
        Cnvs cnvs = new Cnvs();
        System.out.print("Digite seu nome: ");

        String nome = scanner.nextLine();
        cnvs.setNome(nome);
        scanner.close();
        System.out.print("Nome: ");
        cnvs.verificar();

    }
}
