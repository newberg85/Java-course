package fundamentos.exercicios;

public class Exercicio09OperadoresLogicos {

    public static void main(String[] args) {
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou Tv de 50 polegadas\"?" + comprouTv50);
        System.out.println("Comprou Tv de 32 polegadas\"?" + comprouTv32);
        System.out.println("Comprou Tv de 32 polegadas\"Sorvete?" + comprouSorvete);
        // Operador unário
        System.out.println("Mais saudavel" + maisSaudavel);
    }

}
