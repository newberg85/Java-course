package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio11AreaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;
        double resultado;

        System.out.println("Qual a base do triangulo? ");
        base = entrada.nextDouble();
        System.out.println("Qual a altura do triangulo? ");
        altura = entrada.nextDouble();

        resultado = (base * altura) / 2;
        System.out.println("A area do triangulo é" + resultado);


        entrada.close();
    }
}
