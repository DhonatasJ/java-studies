package testes;

import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number quick ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        scanner.close();

        String result = calc(x, y, z);
        print(result);
    }

    public static String calc(int x, int y, int z) {
        String res;
        if (x > y) {
            res = "OK";
        } else {
            res = "FODASE";
        }
        return res;
    }

    public static void print(String op) {
        System.out.println(op + "-I-I-I-I-I-I-");
    }
}
