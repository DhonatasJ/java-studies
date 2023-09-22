package valor;

import javax.swing.JOptionPane;

public class Form {
    private String nome;
    private Double altura;
    private Integer idade;

    public Form(String nome, String idade, String altura){
    System.out.println("Running my code!");
        this.nome = nome;
        this.idade = Integer.parseInt(idade);
        this.altura = Double.parseDouble(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void retorno() {
        String msg = String.format("Nome: %s \nIdade: %d \nAltura: %.2f", nome, idade, altura);
        JOptionPane.showMessageDialog(null, msg, "Dados pessoais", 0);
    }


}