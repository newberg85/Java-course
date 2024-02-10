package fundamentos.exercicios;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        //ler num1
        //ler num2
        //ler perguntar qual a operação o usuario quer fazer
        
        Scanner entrada = new Scanner(System.in);
        double num1;
        double num2;
        String op;

        System.out.println("Digite o primeiro valor: ");
        num1 = entrada.nextDouble();
        System.out.println("Digite o segundo nome: ");
        num2 = entrada.nextDouble();

        System.out.println("Qual operação você deseja fazer? (+) | (-) | (*) | (/)");
        op = entrada.next();

        // Lógica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado );

        entrada.close();
    }

}
