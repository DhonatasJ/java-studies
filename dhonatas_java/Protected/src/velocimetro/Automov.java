package velocimetro;
import java.util.Random;

public abstract class Automov {
    public Automov(){

    }

    public abstract void velocidade();

    protected int difVelocid(){
        Random geRandom = new Random();
        int numero = 1 + geRandom.nextInt(9);
        return numero;
    }   
}
