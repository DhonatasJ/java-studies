

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Carro.getAno());
        Carro p = new Carro("Prisma 2010", 18000);
        Carro c = new Carro("Corsa", 23400);
        Carro r = new Carro("RAM ", 2400000);
        
        System.out.println("Ano " + p.getClass());
        System.out.println("Valor " + c.getValor());
        System.out.println("Modelo " + r.getModelo());
    }
}
