package devFlix;

public class Videos {
    private String nome;

    public Videos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void play(){
        System.out.println("PlayON");
    }
    
}
