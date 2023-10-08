package devFlix;

public class Filme extends Videos{
    private String audio;
    private String legenda;

    public Filme(String nome) {
        super(nome);
        this.audio = "English";
        this.legenda = "Null";
    }
    
    @Override
    public void play() {
        System.out.println("Play: " + getNome());
    }

    public void play(String audio, String legenda){
        System.out.println("Play: " + getNome() + " in " + audio);
        this.audio = audio;
        if (audio == "PT-BR"){
            this.legenda = "Portugues";
        } else{
            this.legenda = legenda;
        }        
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

  

    
}
