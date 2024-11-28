package chat;

import java.util.Scanner;

public class parouimpar {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        if ( numero % 2 == 0){
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
        scanner.close();
    }
}
