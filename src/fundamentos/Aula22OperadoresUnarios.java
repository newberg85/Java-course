package fundamentos;

public class Aula22OperadoresUnarios {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++;
        a--;

        ++b;
        --b;

        System.out.println(a);
        System.out.println(b);

        System.out.println(++a == b--); // true
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
    }

}
