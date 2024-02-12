package controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.print("Qual a sua nota? ");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0) {
                total += nota;
                quantidadDeNotas++;
            } else if (nota != -1) {
                System.out.println("Nota inválida");
            }
        }

        // Calcular a média

        double media = total / quantidadDeNotas;
        System.out.println("Média da turma é: " + media);

        entrada.close();
    }

}
