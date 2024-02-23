package classe.desafioModulo;

public class Jantar {

    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 0.223);
        Comida c2 = new Comida("Feijão", 0.300);

        Pessoa p1 = new Pessoa("Berg ", 89.800);

        System.out.println(p1.apresentar());
        p1.comer(c1);

        System.out.println(p1.apresentar());
        p1.comer(c2);
        
        System.out.println(p1.apresentar());
    }

}
