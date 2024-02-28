package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

    @SuppressWarnings({ "rawtypes", "unchecked" }) // Remover warning
    public static void main(String[] args) {
        /* Conjunto heterogêneo */
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double 
        conjunto.add(true); // boolean -> Boolean 
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // Char -> Character
        
        System.out.println("Tamanho é " + conjunto.size());
        
        conjunto.add("teste"); // adiciona + 1 elemento pois o rashcode é diferente
        conjunto.add("Teste"); // Não adiciona pois o hascode é repetido
        System.out.println("Tamanho é " + conjunto.size());
        
        System.out.println(conjunto.remove(2)); // .remove retorna true ou false caso consiga remover ou não um valor
        System.out.println(conjunto.remove(1)); // retorna True e remove o valor
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains(1)); // retorna false pois o resultao foi removido na linha 25
        System.out.println(conjunto.contains(true)); // retorna true

        HashSet nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums); // [1, 2, 3]

        // conjunto.addAll(nums); // União de conjuntos 
        conjunto.retainAll(nums); // interseção de conjuntos 
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto); // Vazio

}}
