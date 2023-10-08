package animals;

public class Dog extends Lambedor {

    public Dog(String name){
        super(name);
    }

    public void latiu(){
        System.out.println(getName() + " latiu");
    }
}
