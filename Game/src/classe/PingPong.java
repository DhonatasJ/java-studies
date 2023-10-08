package classe;

public class PingPong implements Jogo {

    @Override
    public void jogar() {
        System.out.println("Bolinha pulando........");
    }

    @Override
    public void fechar() {
        System.out.println("Game over");
    }
    
}
