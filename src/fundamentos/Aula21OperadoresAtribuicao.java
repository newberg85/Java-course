package fundamentos;

public class Aula21OperadoresAtribuicao {

    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;

        c += b;
        c -= a;
        c *= a;
        c /= a;
        System.out.println(c);
        c %= 2;
        System.out.println(c);
    }

}
