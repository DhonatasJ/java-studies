import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        double num = 32.4533421;
        int num1 = 41;
        String nome = "Dhonatas";
        int idade = 19;
        float salario = 1234.43f;

        System.out.printf("%.2f%n", num);
        System.out.println("Hello world!");
        System.out.printf("The %.2f sum value " + "%.2f + was that!!!!!!!!!%n",(num + num1), num);
        Locale.setDefault(Locale.ENGLISH);

        System.out.printf("%s tem %d e ganha R$ %.2f%n", nome, idade, salario);

    }
}