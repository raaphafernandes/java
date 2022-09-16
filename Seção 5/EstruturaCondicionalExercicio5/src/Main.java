import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigoProd;
        int quantidade;
        double cachorroQuente = 4.00;
        double xSalada = 4.50;
        double xBacon = 5.00;
        double torradaSimples = 2.00;
        double refrigerante = 1.50;
        double valorTotal;

        codigoProd = sc.nextInt();
        quantidade = sc.nextInt();

        if (codigoProd == 1){
            valorTotal = quantidade * cachorroQuente;

        } else if (codigoProd == 2) {
            valorTotal = quantidade * xSalada;

        } else if (codigoProd == 3) {
            valorTotal = quantidade * xBacon;

        } else if (codigoProd == 4) {
            valorTotal = quantidade * torradaSimples;

        } else {
            valorTotal = quantidade * refrigerante;

        }

        System.out.printf("TOTAL: R$ %.2f\n", valorTotal);

        sc.close();
    }
}