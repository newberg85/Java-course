import java.util.Scanner;

public class Exercicio03EstruturasDeDecisaoIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // digitar via teclado

        double nota1, nota2, nota3, media;

        System.out.println("Digite o valor da nota 1:");
        nota1 = input.nextDouble();

        System.out.println("Digite o valor da nota 2:");
        nota2 = input.nextDouble();

        System.out.println("Digite o valor da nota 3:");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("O aluno está aprovado e a média dele é " + media);
        } else if (media < 4) {
            System.out.println("Esse aluno está reprovado e a media dele é " + media);
        } else {
            System.out.println("O aluno está em recuperação final " + media);
        }

        input.close();
    }
}
