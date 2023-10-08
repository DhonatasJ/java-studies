public class Cnvs {
    public String nome;
    private String result;
    static final int size = 6;

    public Cnvs() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static int getSize() {
        return size;
    }

    public void verificar(){
        if(nome.length() < size){
            System.out.println("Valid Pass");
        } else{
            System.out.println("Invalid");
        }

    }
}
