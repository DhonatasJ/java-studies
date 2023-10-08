package animals;

public class Lambedor extends Animal {
    public Lambedor(String name){
        super(name);
    }

    public void lambe(){
        System.out.println(getName() + " esta lambendo\n");
    }
}
