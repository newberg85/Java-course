package fundamentos;
public class Aula04AritmeticosDeAtribuicaoERelacionais {

    // OPERADORES ARITMETICOS COM ATRIBUÇÃO

    /* 
     += : Atribuição aditiva
     -= : Atribuição subtrativa
     *= : Atribuição de multiplicação
     /= : Atribuição de divisão
     %= : Atribuição de modulo
    */ 

    /* 
     == : Igual
     != : Diferente
     < : Menor
     > : Maior
     >= : Maior ou igual
     <= : Menor ou igual
    */
    
    public static void main(String[] args) {
        int numero;

        numero = 6;
        //numero = numero++; (numero + 1)
        numero += 2; // numero = numero + 2;
        System.out.println(numero);
        numero -= 2;
        System.out.println(numero); // numero = numero - 2;


        int numero2;

        numero2 = 7;

        System.out.println(numero2 > 7); // False
        System.out.println(numero >= 7); // True
        System.out.println(numero2 < 5); // False
    }

}
