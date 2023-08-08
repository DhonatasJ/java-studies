package testes;

public class StringExe {
    public static void main(String[] args){
        String nome = "Dhonatas DE jesus";

        String n1 = nome.toLowerCase();
        String n2 = nome.trim();
        String n3 = nome.replace("jesus", "Silva");
        String n4 = nome.toUpperCase();
        String n5 = nome.substring(0,8);
        int i = nome.indexOf("s");
        int x = nome.lastIndexOf("s");
        String[] vector = nome.split(" ");
        String word1 = vector[0];
        String word2 = vector[2];
        String word3 = vector[1];



        System.out.println(n1);
        System.out.println(n2 + "ok");
        System.out.println(n3);
        System.out.println(n4 + "ok");
        System.out.println(n5);
        System.out.println(i);
        System.out.println(x);
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}
