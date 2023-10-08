import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Elements.Circle;
import Elements.Color;
import Elements.Rectangle;
import Elements.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        List<Shape> list = new ArrayList<>();

        for(int i=0; i<n;i++){
            System.out.print("Shape #" + (i+1) +" data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Heigth: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }

  
        }
          System.out.println("SHAPE AREAS: ");
            for (Shape sh : list){
                System.out.format("%.2f \n", sh.area());
            }
    }
}
