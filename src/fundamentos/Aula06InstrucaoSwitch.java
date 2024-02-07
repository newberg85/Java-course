package fundamentos;
public class Aula06InstrucaoSwitch {

    public static void main(String[] args) {
        int numero = 1;

        switch (numero) {
            case 1:
                System.out.println("Você digitou 1");
                break;
            case 2:
                System.out.println("Você digitou 2");
                break;
            default:
                System.out.println("Você digitou um valor invalido");
        }
    }

}
