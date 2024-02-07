package fundamentos.exercicios;
public class Exercicio08DesafioAritmeticos {

    public static void main(String[] args) {
        // int elevar = (int) Math.pow(a, 2); // Elevar número

        double numA = Math.pow(6 * (3 + 2), 2);
        double denA = 3 * 2;

        double numB = (1-5) * (2-7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB = Math.pow(numB / denB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;
        
        System.out.println("O resultado é " + resultado);
    }

}
