package fundamentos.exercicios;
import java.util.Scanner;

public class Exercicio06Temperatura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double ajuste = 32; // final é usado para constantes 
        final double fator = 5 / 9.0;
        double grausF;
        double grausC;

        System.out.println("Digite a quantidade de Graus em fahrenheit: ");
        grausF = input.nextInt();
        grausC = (grausF - ajuste) * fator;
        System.out.println("O valor de ºF" + grausF + " é ºC" + grausC );

        input.close();
    }

}
