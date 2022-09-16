import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inicioJogo = sc.nextInt();
        int fimJogo = sc.nextInt();
        int duracao;

        if (inicioJogo < fimJogo){
            duracao = fimJogo - inicioJogo;
        }
       else {
           duracao = 24 - inicioJogo + fimJogo;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

       sc.close();

    }
}