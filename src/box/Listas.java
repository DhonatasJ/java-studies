package box;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args){

        List<Integer> myList = new ArrayList<>();

        for (int i=0; i<10; i++){
            int x = (int) (Math.random() * 100) + 1;
            myList.add(x);
        }

        for (int num : myList){
            System.out.println(num);
        }

        List<String> names = new ArrayList<>();
        names.add("Juliana");
        names.add("Natalia");
        names.add("Dhonatas");
        names.add("Diego");
        names.add("Duda");
        names.add("Carla");
        names.add("Katia");
        names.add("aAka");
        names.add(2, "Luhj");
        names.remove("Katia");
        names.removeIf(x -> x.charAt(1) =='A' || x.charAt(1) == 'a');

        List<String> result = names.stream().filter(x -> x.charAt(0) == 'D').collect(Collectors.toList());

        String name = names.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
        System.out.println(name);
        System.out.println("----------------------------------");
        System.out.println("Index of " + names.indexOf("Juliana"));
        for (String x : names){
            System.out.println(x);
        }
    }
}

