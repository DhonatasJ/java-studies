package classe;

public class VideoGame {
    private Jogo jogo;
    private boolean estaLigaado;

    public void ligar(){
        System.out.println("PS4  LIGANDO");
        this.estaLigaado = true;
    }

    public void jogar(Jogo jogo){
        if(estaLigaado == true){
            System.out.println("GAME IS START");
            this.jogo = jogo;
            jogo.jogar();
        } else{
            System.out.println("GAME IS OFF");
        }
    }    

    public void fechar(Jogo jogo){
        System.out.println("Fechando....");
        boolean jgRodando = jogo != null;
        if(jgRodando){
            jogo.fechar();
            jogo = null;
        } else{
            System.out.println("Sem jogos rodando");
        }
    }
}
