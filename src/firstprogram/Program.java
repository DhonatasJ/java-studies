package firstprogram;

import firstprogram.entities.Product;

public class Program {
    public static void main(String[] args) {

        Product product = new Product("Mouse", 1390.90, 89);

        product.setName("Mouse");
        System.out.println(product.getName());

//        product.setPrice(13290.90);
        System.out.println(product.getPrice());

//        product.setQuantity(11+2);
        System.out.println(product.getQuantity());
    }}
