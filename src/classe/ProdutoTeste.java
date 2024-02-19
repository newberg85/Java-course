package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89, 0.25);
        // p1.nome = "Notebook";
        // p1.preco = 4356.89;
        // p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Celular";
        p2.preco = 2600.85;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaDoCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println(precoFinal1);
        System.out.println(precoFinal2);
        System.out.printf("Média do carrinho = R$%.2f.", mediaDoCarrinho);
    }

}
