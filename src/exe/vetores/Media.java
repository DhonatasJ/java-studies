package exe.vetores;

import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Quantos numeros voce vai digitar? ");
        int num = scanner.nextInt();
        double[] vetor = new double[num];
        for (int i=0; i<vetor.length; i++){
            vetor[i] = scanner.nextDouble();
        }

        System.out.printf("VALORES: ");
        for (int i=0; i<vetor.length; i++){
            System.out.printf(vetor[i] + " ");
        }
        System.out.println();
        double soma = 0;
        for (int i=0; i<vetor.length; i++){
            soma += vetor[i];
        }
        System.out.printf("SOMA: %.2f%n", soma);
        double media = soma/vetor.length;
        System.out.printf("MEDIA: %.2f%n",  media);
    }
}
