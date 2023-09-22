package exe.vetores;

import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input the amount of people: ");
        int n = scanner.nextInt();

        String[] nomeVect = new String[n];
        int[] idadeVect = new int[n];
        double[] alturaVect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Name:");
            nomeVect[i] = scanner.next();
            System.out.printf("Age: ");
            idadeVect[i] = scanner.nextInt();
            System.out.printf("Height: ");
            alturaVect[i] = scanner.nextDouble();
        }

        System.out.println("PEOPLE WITH MORE THAN 16 AGE:");
        for (int i = 0; i < n; i++) {
            if (idadeVect[i] > 16) {
                System.out.println(nomeVect[i]);
            }
        }

        double media = 0;
        for (int j = 0; j < n; j++) {
            media += alturaVect[j];
        }
        media /= n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", media);
    }
}
