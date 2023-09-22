import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        int nome = 0;
        try{
            nome = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println(e + "-------");
        }
        System.out.println(nome);
        sc.close();
    }
}
