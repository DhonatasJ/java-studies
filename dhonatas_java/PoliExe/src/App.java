import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Prodcuts.ProductDif;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<ProductDif> commonProduct = new ArrayList<>();
        List<ProductDif> usedProduct = new ArrayList<>();
        List<ProductDif> importedProduct = new ArrayList<>();


        System.out.print("Enter the number of products: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<qtd; i++){
            System.out.print("Common, used or imported(c/u/i) ");
            String type = sc.nextLine();

            System.out.println("");
            ProductDif productDif = new ProductDif();

            System.out.print("Name: ");
            String name = sc.nextLine();
            productDif.setName(name);

            System.out.print("Price: ");
            double price = sc.nextDouble();
            productDif.setPrice(price);

            if (type.equals("i")) {
                System.out.print("Customs: ");
                double customs = sc.nextDouble();
                productDif.setCurstomsFee(customs);
                sc.nextLine(); 
            } else if (type.equals("u")) {
                System.out.print("Date: ");
                String dateStr = sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    productDif.setManufacture(sdf.parse(dateStr));
                } catch (ParseException e) {
                    System.out.println("Error parsing date. Please enter the date in the format dd/MM/yyyy.");
                }
            }
         

            if(type.equals("c")){
                commonProduct.add(productDif);
            } else if (type.equals("i")){
                importedProduct.add(productDif);
            } else if (type.equals("u")){
                usedProduct.add(productDif);
            }
        }
    
        System.out.println("---------------------------------------------");
            System.out.println("Used Products: ");
            for (ProductDif product : commonProduct) {
                System.out.println("Name: " + product.getName() + " Price: " + product.getPrice());
            }
    
            System.out.println("Imported Products: ");
            for (ProductDif product : importedProduct) {
                System.out.format("Name: %s Price: %.2f Customs: %.2f%n", product.getName(), product.taxPrice(), product.getCurstomsFee());
            }
    
            System.out.println("Used Products: ");
            for (ProductDif product : usedProduct) {
                System.out.println("Name: " + product.getName() + " Price: " + product.getPrice() + " Date: " + product.getManufacture());
        }
        sc.close();

    }
}
