package exe.vetores;

import exe.entities.Dados;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args){

        int nmrDaConta;
        String nome;
        String response;
        double deposito = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o numero da conta: ");
        nmrDaConta = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Digite o nome do titular: ");
        nome = scanner.nextLine();
        System.out.printf("Voce deseja depositar um valor? (y/n) ");
        response = scanner.next();
        if (response.equals("y")){
            System.out.printf("Digite o valor a ser depositado: ");
            double depositoInicial = scanner.nextDouble();
            deposito = depositoInicial;
        } else {
            System.out.println("Operacao finalizada!");
        }

        Dados dados = new Dados(nmrDaConta, nome, deposito);

        String depositoModify = String.format("%.2f", deposito);
        System.out.printf("Conta: " + nmrDaConta + "\nNome: " + nome + "\nValor: R$ " + depositoModify);
        System.out.println("\n--------------------------------------------------------------");

        System.out.printf("\nDigite o valor do deposito: ");
        deposito += scanner.nextDouble();
        String depositoModif2 = String.format("%.2f", deposito);
        System.out.printf("\nConta: " + nmrDaConta + "\nNome: " + nome + "\nValor: R$ " + depositoModif2);

        System.out.println("\n--------------------------------------------------------------");
        System.out.printf("\nDigite o valor do saque: ");
        deposito -= scanner.nextDouble();
        String depositoModif3 = String.format("%.2f", deposito);
        System.out.printf("\nConta: " + nmrDaConta + "\nNome: " + nome + "\nValor: R$ " + depositoModif3);
    }
}
