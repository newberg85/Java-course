package oo_composicao.desafio;

public class Sistema {

    public static void main(String[] args) {
        
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.97, 100);
        compra1.adicionarItem(new Produto("Notebook", 3700.88), 2);
        
        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 9.97, 100);
        compra2.adicionarItem(new Produto("Impressora", 1750), 2);
        
        Cliente cliente = new Cliente("Maria Julia Moraes");
        cliente.compras.add(compra1); 
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }
    
}
