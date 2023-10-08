package animals;
public class Pombo extends Animal {
    private int cartasEnv;

    public Pombo(String name){
        super(name);
        cartasEnv=10;

    }

    public void falar(){
        System.out.println("PRUHHHHHHHHHHHH");
    }

    public void envia(){
        cartasEnv++;
        System.out.format("pombo enviou %d cartas\n", cartasEnv);
    }

    public int getCartasEnv() {
        return cartasEnv;
    }

}
