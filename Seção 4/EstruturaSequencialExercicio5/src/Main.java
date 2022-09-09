import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int codPeca1, qtdPeca1, codPeca2, qtdPeca2;
        double valUnit1, valUnit2, total;
        Scanner sc = new Scanner(System.in);

        codPeca1 = sc.nextInt();
        qtdPeca1 = sc.nextInt();
        valUnit1 = sc.nextDouble();

        codPeca2 = sc.nextInt();
        qtdPeca2 = sc.nextInt();
        valUnit2 = sc.nextDouble();

        total = (((qtdPeca1 * valUnit1) + (qtdPeca2 * valUnit2)));

        Locale.setDefault(Locale.US);

        System.out.printf("VALOR A PAGAR = %.2f%n", total);

        sc.close();

    }
}