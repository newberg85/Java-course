package controle;

import java.util.Scanner;

public class Aula06DoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = "";
        
        do {
            System.out.println("Você precisa falar às palavras mágicas");
            System.out.print("Quer sair? ");
            valor = entrada.nextLine();
        } while (!valor.equalsIgnoreCase("Por favor"));

        System.out.println("Obrigado!");

        entrada.close();
    }

}
