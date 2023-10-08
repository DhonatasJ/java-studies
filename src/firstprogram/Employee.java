package firstprogram;

import firstprogram.entities2.Data;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Data data = new Data();
        System.out.printf("Name: ");
        data.name = scanner.next();

        System.out.printf("Salary: ");
        data.salary = scanner.nextDouble();

        System.out.printf("Tax: ");
        data.tax = scanner.nextDouble();

        System.out.println("Salary: " + data);

        System.out.printf("Witch percentage to increase salary?");
        data.percentage = scanner.nextDouble();

// Adiciona a porcentagem ao salário
        data.addPercentage();

        System.out.println("Salary Update: " + data);

        scanner.close();
    }
}
