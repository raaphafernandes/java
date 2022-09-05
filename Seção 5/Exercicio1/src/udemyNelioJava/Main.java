package udemyNelioJava;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String product1 = "Computer";
        String produtct2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;


        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        //System.out.println(product1 + ", which price is $ " + String.format("%.2f", price1)); outra de formatar a string
        System.out.printf("%s, which price is $ %.2f\n\n", produtct2, price2);
        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);

        System.out.printf("\nMeasue with eight decimal places: %.3f", measure);
        System.out.printf("\nRouded (three decimal places): %.3f", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("\nUS decimal point: %.3f", measure);
    }
}

