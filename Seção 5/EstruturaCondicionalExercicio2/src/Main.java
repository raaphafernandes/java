import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        // Se o numero for divisivel por 2 ele é par
        if (valor % 2 == 0){
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}