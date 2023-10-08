package velocimetro;

public class Via extends Automov {

    @Override
    public void velocidade() {
        int vlr = difVelocid();
        if(vlr > 5){
            System.out.println(vlr + " maior q 5");
        } else if (vlr == 6){
            System.out.println(vlr + " igual a 6");
        } else {
            System.out.println(vlr + " é diferente");
        };
    }

    @Override
    public String toString() {
        return "Via []";
    }
}
