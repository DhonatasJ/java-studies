package testes;

import testes.entities.Hirer;

import java.util.Scanner;

public class Rooms {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("How many employees will be registered? ");
        int n = scanner.nextInt();

        Hirer[] hirer = new Hirer[n];

        for(int i=0; i<n; i++){
            System.out.printf("Id:");
            int id = scanner.nextInt();
            System.out.printf("Name:");
            String name = scanner.next();
            System.out.printf("Salary:");
            double salary = scanner.nextDouble();

            hirer[i] = new Hirer(id, name, salary, 0, 0.0);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idSelect = scanner.nextInt();

        System.out.println("Enter the percentage: ");
        double porcent = scanner.nextDouble();

        for (Hirer emp : hirer){
            if(emp.getId() == idSelect){
                emp.setSalary(emp.getSalary() + (emp.getSalary() * porcent) / 100);
            }
        }
        System.out.println("");
        for (Hirer each : hirer){
            System.out.println("ID: "  + each.getId());
            System.out.println("NAME: " + each.getName());
            System.out.println("SALARY: " + each.getSalary());
        }

        scanner.close();
    }
}


