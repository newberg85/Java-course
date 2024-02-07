package fundamentos;
public class Aula01Introducao {
    /* public é um modificador de acesso. Uma variável, método ou classe marcada com o modificador público pode ser acessada de qualquer lugar no programa. Existem quatro deles em Java: público, privado, protegido e padrão (vazio). vazio o tipo de retorno do método. Void significa que não retorna nenhum valor. main representa o ponto inicial do programa. Este é o nome do método. String[] args é um argumento do método principal. Por enquanto basta saber que quase todo programa Java tem o método main, ele inicia o programa e declara como public static void main(String[] args) Os métodos  estáticos são aqueles para trabalhar com a classe. Os métodos que usam a palavra-chave static em sua declaração só podem trabalhar diretamente com variáveis ​​locais e estáticas.  */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

}

/* REGRAS DO JAVA */
/* - o nome do arquivo deve ser idêntico ao nome da classe;
   - Na maioria das vezes, cada classe está em um arquivo separado com uma extensão .java. Os arquivos de classe geralmente são agrupados em pastas. Essas pastas são chamadas de pacotes;
   -os caracteres diferenciam maiúsculas de minúsculas. String não é igual a string ;
   -O início do processamento do programa Java sempre começa no método principal : public static void main (String [] args) . O método main () é uma parte obrigatória de qualquer programa Java;
   -Método (procedimento, função) é uma sequência de comandos. Os métodos definem o comportamento de um objeto;
   -A ordem dos métodos no arquivo do programa é irrelevante;
   -A primeira letra do nome de uma classe é maiúscula. Se você estiver usando várias palavras, use letras maiúsculas para a primeira letra de cada palavra (“MyFirstJavaClass”);
   -Os nomes de todos os métodos na sintaxe Java começam com uma letra minúscula. Ao usar várias palavras, as letras subsequentes são maiúsculas ("public void myFirstMethodName ()");
   -Os arquivos são salvos com nome de classe e extensão .java ("MyFirstJavaClass.java");
   -Na sintaxe Java, existem delimitadores "{...}" que denotam um bloco de código e uma nova área de código;
   -Cada instrução de código deve terminar com um ponto e vírgula. */