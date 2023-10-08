import java.util.Scanner;
import RulesAndData.Rules;

public class App {
    public static void main(String[] args) throws Exception {
        Rules[] contributions = getContribData();
        printContrib(contributions);
    }

    public static Rules[] getContribData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Rules[] contributions = new Rules[n];

        for (int i = 0; i < n; i++) {
            Rules data = new Rules(); // Use Rules instead of Data
            
            System.out.println("Tax payer " + (i + 1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            data.setName(name);
            System.out.print("Annual income: ");
            double annual = sc.nextDouble();
            data.setAnualIncome(annual);

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                data.setHealthExpenditures(health);
            } else if (ch == 'c') {
                System.out.print("Number of employees: ");
                int emp = sc.nextInt();
                data.setNumberOfEmp(emp);
            }
            contributions[i] = data;
        }
        sc.close();
        return contributions;
    }

    public static void printContrib(Rules[] contributions) {
        for (int i = 0; i < contributions.length; i++) {
            System.out.print("Name: " + contributions[i].getName());
            if (contributions[i].getNumberOfEmp() <= 0) {
                System.out.println(" Total: " + contributions[i].individual());
            } else if(contributions[i].getNumberOfEmp() >= 1){
                System.out.println(" Total: " + contributions[i].company());
            }
        }
    }
}
