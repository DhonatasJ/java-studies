import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(32);
        nums.add(43);
        nums.add(765);
        nums.add(1);
        nums.add(54);
        nums.add(78);

        Pessoa joao = new Pessoa("Joao", 20);
        Pessoa carel = new Pessoa("Carel", 12);
        Pessoa luciane = new Pessoa("Luciane", 43);
        Pessoa luzia = new Pessoa("Luzia", 32);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(0, carel);
        pessoas.add(0, joao);
        pessoas.add(0, luzia);
        pessoas.add(0, luciane);

        for (Pessoa p : pessoas) {
            System.out.println(p.getIdade());
        }
        System.out.println("--------------------------");

        Collections.sort(nums, Collections.reverseOrder());
        for (Integer n : nums) {
            System.out.println(n);
        }
    }   
}
