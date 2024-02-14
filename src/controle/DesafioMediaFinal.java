package controle;

import java.util.Scanner;

public class DesafioMediaFinal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media >=7) {
            System.out.println("A média do aluno é " + media + " e ele foi aprovado");
        } else if (media < 7 && media > 4) {
            System.out.println("A média do aluno é " + media + " e ele está de recuperação");
        } else {
            System.out.println("A média do aluno é " + media + " e ele está de reprovado");
        }

        entrada.close();
    }

}
