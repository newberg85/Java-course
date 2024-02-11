package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio10IMC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso;
        double altura;
        double resultado;

        System.out.println("Qual o seu peso: ");
        peso = entrada.nextDouble();
        System.out.println("Qual a sua altura: ");
        altura = entrada.nextDouble();

        resultado = peso / (altura * altura);
        System.out.println("O valor do seu IMC é" + resultado);

        entrada.close();
    }

}
