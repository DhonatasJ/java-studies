package exe.vetores;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Quantos numeros sera inseridos? ");
        int n = scanner.nextInt();
        int[] vect = new int[n];
        int num = 0;

        System.out.println("Digite os numeros: ");
        for (int i=0; i<n; i++){
            num = scanner.nextInt();
            vect[i] = num;
        }
        int count = 0;
        System.out.printf("Numeros pares: ");
        for (int i=0; i<n; i++){
            if(vect[i] % 2 == 0){
                System.out.printf(vect[i] + "  ");
                count++;
            }
        }
        System.out.println();
        System.out.printf("Quantidade de numeros pares: " + count);
    }
}
