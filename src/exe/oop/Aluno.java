package exe.oop;

import exe.entities.DadosAln;

import java.util.Arrays;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Dados de quantos alunos serao inseridos? ");
        int n = scanner.nextInt();
        DadosAln[] alunos = new DadosAln[n];

        String[] materias = {"Portugues", "Matematica", "Ciencias", "Geografia", "Historia"};

        for (int j=0; j<n; j++){
            System.out.printf("Nome do " + (j+1) + "º aluno: ");
            String nome = scanner.next();
            System.out.printf("Matricula: ");
            int matricula = scanner.nextInt();
            System.out.println("Notas do aluno");
            double[] mediaNt = new double[5];
            for (int i = 0; i < 5; i++) {
                System.out.printf(materias[i] + ": ");
                mediaNt[i] = scanner.nextDouble();
            }
            alunos[j] = new DadosAln(nome, matricula, mediaNt);
        }

        for (int i=0; i<n; i++){
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.println("Matricula: " +alunos[i].getMatricula());
            for (int x=0; x<materias.length; x++){
                System.out.println(materias[x] + ": " + Arrays.toString(alunos[i].getMediaNt()));
            };
            System.out.println();
        }

        scanner.close();
    }
}
