package firstprogram;

import firstprogram.entities3.DadosAln;

import java.util.Scanner;

public class Alunos {
    public static void main(String[] args){
        DadosAln dados = new DadosAln();

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o seu nome: ");
        dados.nome = scanner.next();
        System.out.printf("Digite a sua primeira nota ");
        dados.nota1 = scanner.nextFloat();
        System.out.printf("Digite a sua segunda nota ");
        dados.nota2 = scanner.nextFloat();
        System.out.printf("Digite a sua terceira nota ");
        dados.nota3 = scanner.nextFloat();
        float nota =  dados.nota1 + dados.nota2 + dados.nota3;

        if (nota < 100 && nota > 0) {
            System.out.println("Nota: " + dados.nome + "\nMedia " + nota);
        }
        else{
                System.out.println("Nota incorreta, tente novamente.");
        }
    }
}
