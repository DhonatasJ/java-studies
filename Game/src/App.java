import classe.PingPong;
import classe.VideoGame;
import classe.Xadrez;

public class App {
    public static void main(String[] args) throws Exception {

        VideoGame xDevGame = new VideoGame();
        xDevGame.ligar();
        xDevGame.jogar(new Xadrez());
        xDevGame.fechar(new Xadrez());
    }
}
