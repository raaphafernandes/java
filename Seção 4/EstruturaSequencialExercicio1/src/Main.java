import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valorA, valorB, soma;

        valorA = sc.nextInt();
        valorB = sc.nextInt();
        soma = valorA + valorB;

        System.out.println("SOMA = " + soma);

        sc.close();

    }
}