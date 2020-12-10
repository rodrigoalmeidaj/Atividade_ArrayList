package teste;

import java.util.ArrayList;

import compra.Carrinho;
import compra.Produto;

public class Teste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Tenis NIKE Runner", "Tênis", 299);
        Produto produto2 = new Produto("Bola de Basquete", "Esporte", 150);
        Produto produto3 = new Produto("Camiseta Adidas", "Roupas", 98);

        Carrinho carrinho1 = new Carrinho();
        carrinho1.adicionar(produto1);
        carrinho1.adicionar(produto2);
        carrinho1.adicionar(produto3);

        carrinho1.mostrarProdutos();

    }
}