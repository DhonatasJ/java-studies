public class App {
    public static void main(String[] args) throws Exception {
        Telefone telefone = new Telefone("11 993663299");
        Contato ctt = new Contato("Jaqueline", "3425 6545");
        Contato ctt1 = new Contato("Luiza", "4002 8922");
        Contato ctt2 = new Contato("Arthur", "21 932048922");
        Contatos telefoneContatos = telefone.getContatos();
        telefoneContatos.adicionar(ctt);
        telefoneContatos.adicionar(ctt1);
        telefoneContatos.adicionar(ctt2);
        System.out.println(telefoneContatos.getContatos());
        System.out.println(telefoneContatos.buscar("Ar"));
    }
}
