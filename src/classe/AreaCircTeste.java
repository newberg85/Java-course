package classe;

public class AreaCircTeste {

    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        //a1.pi = 10; // método static o valor é somente da classe
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(5);
        // a2.pi = 5; // assume o PI padrão 
        System.out.println(a2.area());

        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }

}
