package classe;

public class Data {

    // Atributo de objeto ou de instancia por estar fora do método e dentro da classe
    int dia;
    int mes;
    int ano;

    Data() {
        // dia = 1;
        // mes = 1;
        // ano = 1970;
        this(1, 1, 1970); // this como método
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    String obterDataFormatada() {
        final String formato = "%d/%d/%d"; // variaveis definidas dentro de métodos são chamadas de variáveis locais
        return String.format(formato, dia, mes, ano);
    }
}
