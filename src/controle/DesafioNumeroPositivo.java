package controle;

import java.util.Scanner;

public class DesafioNumeroPositivo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número positivo ou um (número negativo para sair):");
            numero = entrada.nextInt();

            if (numero > 0) {
                soma += numero;
                System.out.println("Soma dos números digitados é " + soma);
            }

        } while (numero > 0);
        entrada.close();
    }

}
