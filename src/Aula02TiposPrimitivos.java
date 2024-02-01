public class Aula02TiposPrimitivos {

    /* Inteiros: esse grupo inclui byte, short, int e long, que são para números assinalados com valor inteiro.
    Números de ponto flutuante: esse grupo inclui float e double, que representam números com precisão fracionária.
    Caracteres: esse grupo inclui caracteres(char), que representam símbolos em um conjunto de caracteres, como letras e números.
    Booleano: este grupo inclui booleano(boolean), que é um tipo especial para representar valores verdadeiros / falsos. */

    public static void main(String[] args) {
        byte x = 3; // usa 8 bits de memória
        short y = 4; // usa 16 bits de memória
        int z = 5; // usa 32 bits de memória
        long k = 6; // usa 64 bits de memória
        float u = 2; // usa 32 bits de memória
        double w = 3; // usa 64 bits de memória
        boolean t = true; // usa 1 bit de memória

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);
        System.out.println(u);
        System.out.println(w);
        System.out.println(t);
    }

}
