package serv;

public class Serv extends Casa{
    private String cor;

    public Serv(String nome){
        super(nome);
        setSize(23.3);
        setVlrServico(90);
        this.cor = "Red";
    }

    
    public void casaLimp(){
        System.out.format("A casa %s esta sujo", getNome());
    }
 
    @Override
    public String toString() {
        return "Casa - " + getNome() + "\nHouse size - " + getSize() + "\nValor do serviço - " + getVlrServico() + "\nHouse Color " + cor ;
    }


}
