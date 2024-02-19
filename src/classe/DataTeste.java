package classe;

public class DataTeste {
    
    public static void main(String[] args) {
        Data d1 = new Data();
        // d1.dia = 20;
        // d1.mes = 12;
        // d1.ano = 2004;

        Data d2 = new Data(20, 12, 2004);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }

}
