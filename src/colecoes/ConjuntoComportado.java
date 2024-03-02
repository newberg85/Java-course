package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {
        // HashSet não têm ordem de ordenação 
        // TreeSet não têm ordem de ordenação 
        // Set<String> listaAprovados = new HashSet<String>(); // A lista será obrigatoriamente do tipo string
        SortedSet<String> listaAprovados = new TreeSet<String>(); // A lista será obrigatoriamente do tipo string
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucas");
        listaAprovados.add("Pedro");

        for (String candidato: listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>(); 
        nums.add(1);
        nums.add(2);
        nums.add(30);
        nums.add(22);

        for (int n : nums) {
            System.out.println(n);
        }
    }

}
