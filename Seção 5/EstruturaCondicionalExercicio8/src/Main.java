import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000.00){
            imposto = 00.00;
        }
        else if (salario <= 3000.00) {
            imposto = (salario - 1000.00) * 0.08;
        }
        else if (salario <= 4500.00) {
            imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
        }
        else {
            imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
        }
        if (imposto == 00.00){
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}