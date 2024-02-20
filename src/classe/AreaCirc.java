package classe;

public class AreaCirc {
    double raio;
    // static double pi = 3.14;
    final static double PI = 3.14; // O Pi não pode mais ser alterado

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }
}
