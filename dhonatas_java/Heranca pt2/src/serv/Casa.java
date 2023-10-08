package serv;

public class Casa {
    private String nome;
    private double size;
    private int vlrServico;
    public Casa(String nome) {
        this.nome = nome;
        this.size = 0.1;
        this.vlrServico = 2;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public int getVlrServico() {
        return vlrServico;
    }
    public void setVlrServico(int vlrServico) {
        this.vlrServico = vlrServico;
    }     
    
    public void casaLimp(){
        System.out.println("A casa esta sujo");
    }
}
