public class Aula17ConversãoDeNumeroParaString {

    public static void main(String[] args) {
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = 1000000;
        System.out.println(Integer.toString(num2).length());

        System.out.println(("" + num1).length());
    }

}
