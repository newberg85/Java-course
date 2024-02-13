package controle;

import java.util.Scanner;

public class DesafioNumParEntre0e10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número ");
        
        
        int num = entrada.nextInt();
        if(num % 2 == 0 && num >= 0 && num <= 10) {
            System.out.println(num + " está entre 0 e 10 e é Par");
        } else if (num % 2 == 0 && !(num >= 0 && num <= 10)) {
            System.out.println(num + " é Par, mas não está entre 0 e 10");
        } else if (num % 2 != 0 && num >= 0 && num <= 10 ) {
            System.out.println(num + " é impar e está entre 0 e 10");
        } else {
            System.out.println(num + " é impar e não está entre 0 e 10");
        }

        entrada.close();
    }

}
