import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numFunc;
        int horasTrab;
        double valorHr;
        double salario;

        numFunc = sc.nextInt();
        horasTrab = sc.nextInt();
        valorHr = sc.nextDouble();
        salario = (valorHr * horasTrab);

        //System.out.println("NUMERO FUNCIONARIO: " + numFunc + " SALARIO = U$ " + salario);
        System.out.println("NUMERO FUNCIONARIO: " + numFunc);
        Locale.setDefault(Locale.US);
        System.out.printf("SALARIO = U$ %.2f", salario);

        sc.close();

    }
}