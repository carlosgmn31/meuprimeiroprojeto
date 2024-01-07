import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Iniciando o desafio...");
        int objetivo = new Random().nextInt(100);
        int tentativas = 5;
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Você tem " + (tentativas-i) + " restantes");
            Scanner entrada = new Scanner(System.in);
            System.out.println(objetivo);
            int tentativa = entrada.nextInt();

            if (tentativa > objetivo){
                System.out.println("o numero é menor que: " + tentativa);

            } else if (tentativa < objetivo) {
                System.out.println("o numero é maior que: " + tentativa);
            }
            else {System.out.println("Você acertou, parabéns");
            break;}
        }
        System.out.println("Você esgotou as tentativas! :(");
    }
}
