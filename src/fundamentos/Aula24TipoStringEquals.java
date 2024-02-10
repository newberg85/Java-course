package fundamentos;

import java.util.Scanner;

public class Aula24TipoStringEquals {

    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next(); // next() tira os spaços em branco e o nextLine() não tira
        System.out.println("2" == s2.trim()); //trim() retira os espaços em branco
        System.out.println("2".equals(s2.trim()));

        entrada.close();
    }

}
