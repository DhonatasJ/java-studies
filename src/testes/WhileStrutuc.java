package testes;

import java.util.Scanner;
import java.lang.String;
public class WhileStrutuc {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         String x;
         do {
             double f = scanner.nextDouble();
             double celsius;
             celsius = (f - 32)/1.8;
             System.out.println(celsius + "ºC");
             x = scanner.next();
             System.out.println("Deseja continuar S ou N?");
         } while(x == "s" || x == "s");
     }
}
