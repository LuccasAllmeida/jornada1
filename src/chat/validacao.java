package chat;

import java.util.Scanner;

public class validacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int nota = scanner.nextInt();

        if (nota >= 90) {
            System.out.println("A");
        } else if (nota >= 80 && nota < 89) {
            System.out.println("B");
        }
        else if (nota == 2000) {
            nota -= nota * 0.15; // Subtrai 15% da nota
            System.out.println("Nova nota: " + nota);
        } else {
            
        }

    }
}