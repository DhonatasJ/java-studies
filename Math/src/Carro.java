public class Carro {
    private String modelo;
    private double valor;
    public static int ano = 2023;
    public Carro(String modelo, double valor) {
        this.modelo = modelo;
        this.valor = valor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public static int getAno() {
        return ano;
    }
    public static void setAno(int ano) {
        Carro.ano = ano;
    }

    
}
