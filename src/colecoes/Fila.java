package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // offer e add -> adicionam elementos na fila
        // A diferença é quando a fila está chei
        fila.add("Ana"); // Gera um erro
        fila.offer("Bia"); // Retorna false
        fila.add("Carlos"); 
        fila.offer("Daniel"); 
        fila.add("Rafaela"); 
        fila.offer("Gui"); 

        System.out.println(fila.peek()); // Retorna Null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Retorna um erro

        //fila.size();
        //fila.clear();
        //fila.isEmpty();

        System.out.println(fila.poll()); // remove o primeiro elemento da fila e depois do último valor ele retorna Null
        System.out.println(fila.remove()); // remove o primeiro elemento da fila e depois do último valor retorna um erro
    }

}
