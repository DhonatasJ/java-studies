import animals.Cat;
import animals.Dog;
import animals.Pombo;

public class App {
    public static void main(String[] args) throws Exception {
        Cat gato = new Cat("Bolinha");   
        Dog cachorro = new Dog("Lilica");
        Pombo pombo = new Pombo("Jorgin");
        gato.beber();
        gato.comer();
        cachorro.beber();
        cachorro.latiu();
        pombo.falar();
        pombo.envia();
        gato.lambe();
        cachorro.lambe();
    }
}
