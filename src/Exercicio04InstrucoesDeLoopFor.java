import java.util.Scanner;

public class Exercicio04InstrucoesDeLoopFor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        for(int i = 1; i <= 3; i++){
            System.out.println("aluno " + i);
            System.out.println("Digite a nota 1: ");
            nota1 = input.nextDouble();

            System.out.println("Digite a nota 2: ");
            nota2 = input.nextDouble();

            System.out.println("Digite a nota 3: ");
            nota3 = input.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;

            System.out.println("A média do aluno " + i + " é " + media);
        }
    }

}
