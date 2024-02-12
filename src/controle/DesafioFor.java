package controle;

public class DesafioFor {

    public static void main(String[] args) {
        String valor = "#";
        String contador = "#####";
        for (int i = valor.length(); i <= contador.length(); i++) {
            System.out.println(valor);
            valor += "#";
        }
    }

}
