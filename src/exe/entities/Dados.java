package exe.entities;

public class Dados {
    private int nmrDaConta;
    private String nome;
    private double deposito;
    public Dados(int nmrDaConta, String nome){
        this.nmrDaConta = nmrDaConta;
        this.nome = nome;
    }
    public Dados(int nmrDaConta, String nome, double depositoInicial){
        this.nmrDaConta = nmrDaConta;
        this.nome = nome;
        deposit(depositoInicial);
    }
    public int getNmrDaConta(){
        return nmrDaConta;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getDeposito(){
        return deposito;
    }
    public void deposit(double amount){
        deposito += amount;
    }
    public void withdraw(double amount){
        deposito -= amount + 5.0;
    }
}

