package devFlix;

public class Serie extends Filme{
    private int temporadas;
    private int qtdEpPorTemporada;
    private int temporadaAtual;
    private int episodioAtual;
    public Serie(String nome, int temporadas, int qtdEpPorTemporada) {
        super(nome);
        this.temporadas = temporadas;
        this.qtdEpPorTemporada = qtdEpPorTemporada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    }

    public void assistido(){
        this.episodioAtual++;
        if(episodioAtual == 8){
            this.episodioAtual = 1;
            this.temporadaAtual++;
        }
    }
    public String toString(){
        return String.format("Filme %s (audio %s, Legenda %s) \nTemporadas: %d \nEpisodios %d \nAssistindo T%d x EP%d",
         getNome(), getAudio(), getLegenda(), temporadas, qtdEpPorTemporada * temporadas, temporadaAtual, episodioAtual);
    }



    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getQtdEpPorTemporada() {
        return qtdEpPorTemporada;
    }
    public void setQtdEpPorTemporada(int qtdEpPorTemporada) {
        this.qtdEpPorTemporada = qtdEpPorTemporada;
    }
    public int getTemporadaAtual() {
        return temporadaAtual;
    }
    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }
    public int getEpisodioAtual() {
        return episodioAtual;
    }
    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }

}
