package fundamentos;
import java.util.Scanner;

public class Aula014Console {

    public static void main(String[] args) {
        System.out.print("Bom"); // continua na mesma linha
        System.out.print("Dia");
        System.out.println();

        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.1f %n", 1234.5678);
        System.out.printf("Nome: %s %n", "João");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("\n\nNome = " + nome);

        entrada.close();
    }

}
