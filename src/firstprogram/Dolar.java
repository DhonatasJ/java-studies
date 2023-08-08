package firstprogram;

import firstprogram.entities4.Get;

import java.util.Scanner;

public class Dolar {
    public static void main(String[] args){
        Get get = new Get();

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o valor do dolar: ");
        get.dollar = scanner.nextDouble();
        System.out.printf("Digite o valor que voce ira converter: ");
        get.qtd = scanner.nextDouble();

        get.Liquid();
        System.out.println(get);
        scanner.close();
    }
}
