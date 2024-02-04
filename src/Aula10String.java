import java.util.Scanner;

public class Aula10String {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome; // Classe string suporta uma cadeia de caracteres
        
        System.out.println("Digite o Seu nome: ");
        nome = input.nextLine();
        System.out.println(nome);
    }

}
