package animals;
public class Cat extends Lambedor {

    public Cat(String name){
        super(name);
    }

    public void miar(){
        System.out.println(getName() + " está miando");
    }


}
