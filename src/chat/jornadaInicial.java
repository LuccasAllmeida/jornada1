package chat;

import java.util.Scanner;

public class jornadaInicial {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double idade = scan.nextDouble();
        double maiorIdade = 18;

        if (idade  > maiorIdade){
            System.out.println("Maior de idade");
        } else {
            System.out.println("menor de idade");
        }
        scan.close();
    }
}

