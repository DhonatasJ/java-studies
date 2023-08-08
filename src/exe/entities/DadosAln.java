package exe.entities;

public class DadosAln {
    private String nome;
    private int matricula;
    private double[] mediaNt;

    public DadosAln(String nome, int matricula, double[] mediaNt){
        this.nome = nome;
        this.matricula = matricula;
        this.mediaNt = mediaNt;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public double[] getMediaNt(){
        return mediaNt;
    }

    public void setMediaNt(double[] mediaNt){
        this.mediaNt = mediaNt;
    }

}
