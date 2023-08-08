package exe.matriz;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Type the horizontal size: ");
        int h = scanner.nextInt();
        System.out.printf("Type the vertical size: ");
        int v = scanner.nextInt();

        int[][] matriz = new int[h][v];

        System.out.println("Valores da matriz:");
        for (int i=0; i<h; i++){
            System.out.printf("-vertical-");
            for(int j=0; j<v; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Value to be searched for: ");
        int choice = scanner.nextInt();
        boolean found = false;

        for(int k=0; k < h; k++){
            for(int i=0; i<v;i++){
                if(choice == matriz[k][i]){
                    System.out.println("Value found at position " + i + " " + k);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("Value not found in the matrix.");
        }

        scanner.close();
    }
}
