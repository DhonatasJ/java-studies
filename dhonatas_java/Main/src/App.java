import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        String[] names = new String[3];
        names[2] = "Carlos";
        names[0] = "Joao";
        names[1] = "Ana";

        ArrayList<String> namesDinamico = new ArrayList<String>();
        namesDinamico.add("Carloinas");
        namesDinamico.add("Mouse");
        namesDinamico.add("Teclado");
        namesDinamico.add("Chave");
            System.out.println("-----------------------Simple array");

        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
        
        namesDinamico.remove(2);
        namesDinamico.add(2, "This is new");

        System.out.println("-----------------------For each");
    
        for(String a : names){
            System.out.println(a);
        }

        System.out.println("-----------------------For simple");

        for(int j=0; j < namesDinamico.size(); j++){
            System.out.println(namesDinamico.get(j));
        
        }
    }
}
