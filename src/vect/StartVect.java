package vect;

import vect.entities.Prod;

import java.util.Scanner;

public class StartVect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Prod[] vect = new Prod[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Name of product: ");
            String name = scanner.next();
            System.out.printf("Price: ");
            double price = scanner.nextDouble();
            vect[i] = new Prod(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("%.2f%n", avg);
        scanner.close();
    }
}