package fundamentos;
public class Aula16ConversaoDeTiposPrimitivos {

    public static void main(String[] args) {
        double a = 1; // conversão implicita
        System.out.println(a);

        float b = (float) 1.12345678; // conversão explicita (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; // conversão explicita (CAST)
        System.out.println(d);

        double e = 1.000000;
        int f = (int) e;
        System.out.println(f);
    }

}
