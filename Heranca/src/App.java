import java.util.Scanner;
import Emp.Pgto;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Pgto[] employees = new Pgto[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Outsourced (y/n): ");
            String yOrNot = sc.nextLine();

            if (yOrNot.equalsIgnoreCase("y")) {
                System.out.print("Name: ");
                String wName = sc.nextLine();

                System.out.print("Hours: ");
                int wHour = sc.nextInt();

                System.out.print("Value per hour: ");
                double wPer = sc.nextDouble();

                System.out.print("Additional charge: ");
                double wAdd = sc.nextDouble();

                employees[i] = new Pgto(wName, wHour, wPer, wAdd);
            } else {
                System.out.print("Name: ");
                String wName = sc.nextLine();

                System.out.print("Hours: ");
                int wHour = sc.nextInt();

                System.out.print("Value per hour: ");
                double wPer = sc.nextDouble();

                employees[i] = new Pgto(wName, wHour, wPer, 0); // Não terceirizado
            }
            sc.nextLine(); // Consumir a nova linha após a leitura do double
        }

        System.out.println("Payments:");
        for (Pgto employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Payment: " + employee.payment());
            System.out.println();
        }
    }
}
