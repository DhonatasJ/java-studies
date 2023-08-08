package exe.vetores;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] agrs){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o tamanho do vetor: ");
        int num = scanner.nextInt();
        if (num > 10){
            System.out.println("O tamanho do seu vetor precisa ser menos que 10...");
            num = scanner.nextInt();
        }

        int[] vect = new int[num];
        System.out.println("Digite os valores: ");

        for (int i=0; i<vect.length; i++){
            System.out.printf("-------------- ");
            vect[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i=0; i<vect.length; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
        }}

        scanner.close();
    }
}
