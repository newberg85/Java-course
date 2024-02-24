package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CalculandoMedia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas você quer informar?");
        int quantidadeDeNotas = entrada.nextInt();
        double[] notasAluno = new double[quantidadeDeNotas];

        for (int i = 0; i < notasAluno.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = entrada.nextDouble();
            notasAluno[i] = nota;
        }

        double total = 0;
        for (double nota : notasAluno) {
            total += nota;
        }

        double media = total / quantidadeDeNotas;
        System.out.println(Arrays.toString(notasAluno));
        System.out.println("A media do aluno é " + media);



        entrada.close();
    }

}
