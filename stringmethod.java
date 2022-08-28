import java.util.Locale;
import java.util.Scanner;

public class stringmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Prabhat";
        System.out.println(name);

        int length = name.length();
        System.out.println(length);

        String valuel = name.toLowerCase();
        System.out.println(valuel);

        String valueu = name.toUpperCase();
        System.out.println(valueu);

        String name1 = "    prabhat    ";
        System.out.println(name1);

        System.out.println(name1.trim());

        System.out.println(name.length());

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.substring(2));
        System.out.println(name.substring(0));
        System.out.println(name.substring(2,5));
        System.out.println(name.replace('r','p'));
        System.out.println(name);

        System.out.println(name.startsWith("P"));
        System.out.println(name.endsWith("t"));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("P"));
        System.out.println(name.indexOf("a",4));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.equals("Prabhat"));  //important
        System.out.println(name.equalsIgnoreCase("prabhat"));
        System.out.println("hello my name is prabhat \n and i am study in BBDITM");
        System.out.println("hello my name is prabhat\tand i am 22 year old ");

    }
}
