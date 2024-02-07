package fundamentos.exercicios;
import java.util.Scanner;

public class Exercicio05String {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        String nome;
        
        for(int i = 0; i < 3; i++) {
            System.out.println("Nome do aluno: ");
            nome = teclado.nextLine();
            System.out.println("Digite a nota 1: ");
            nota1 = teclado.nextDouble();
            System.out.println("Digite a nota 2: ");
            nota2 = teclado.nextDouble();
            System.out.println("Digite a nota 3: ");
            nota3 = teclado.nextDouble();
            teclado.nextLine();
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A media de " + nome + " é " + media);

            teclado.close();
        }
    }

}
