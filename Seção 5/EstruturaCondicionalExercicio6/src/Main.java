import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double input = sc.nextDouble();

        sc.close();

        if (input >= 0 && input <= 25){
            System.out.println("INTERVALO: [0,25]");
        } else if (input > 25 && input <= 50) {
            System.out.println("INTERVALO: (25,50]");
        } else if (input > 50 && input <= 75) {
            System.out.println("INTERVALO: (50,75]");
        } else if (input > 75 && input <= 100) {
            System.out.println("INTERVALO: (75,100]");
        } else{
            System.out.println("FORA DE INTERVALO");
        }
    }
}