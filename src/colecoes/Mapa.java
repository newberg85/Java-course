package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        
        System.out.println(usuarios.keySet()); // Pega apenas as chaves
        System.out.println(usuarios.values()); // Pega apenas os valores
        System.out.println(usuarios.entrySet()); // chave e valor

        System.out.println(usuarios.containsKey(2)); // true
        System.out.println(usuarios.containsValue("Pedro")); // false

        System.out.println(usuarios.get(3)); // retorna o valor
        System.out.println(usuarios.remove(3)); // retorna o valor

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for (Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }
    }

}
