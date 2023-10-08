import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Tax payer " + (i+1) + " data: ");
            System.out.println("Individual or company (i/c)? ");
            char c = sc.next().charAt(1);
            if(c == 'i'){

            }
        }


    }
}
