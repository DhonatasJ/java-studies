import java.util.Locale;

public class Exercise01 {
    public static void main(String[] args) {

        String product1 = "Computer";
        String procuct2 = "Office";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double prince1 = 2100.0;
        double prince2 = 650.50;
        double measure = 53.234567;

        String measureString = String.format("%.2f", measure).replace(".", "-");

        System.out.printf("Products:%n%s, which price is %.2f %n%s desk, witch price is %.2f %n", product1, prince1, procuct2, prince2);
        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f%nRouded (tree decimal places): %.3f%n", measure, measure);
//        Locale.setDefault(Locale.FRANCE);
        System.out.printf("US decimal point: %s", measureString);
    }
}
