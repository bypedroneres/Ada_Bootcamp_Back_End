package aula05;

import java.util.List;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

public class A05EX02 {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Notebook", 2500.0),
                new Produto("Camisa", 50.0),
                new Produto("Smartphone", 1200.0),
                new Produto("Tênis", 150.0)
        );

        Produto produtoMaisCaro = encontrarProdutoMaisCaro(produtos);

        if (produtoMaisCaro != null) {
            System.out.println("O produto mais caro é: " + produtoMaisCaro.getNome());
            System.out.println("Preço: R$" + produtoMaisCaro.getPreco());
        } else {
            System.out.println("A lista de produtos está vazia.");
        }
    }

    public static Produto encontrarProdutoMaisCaro(List<Produto> listaProdutos) {
        if (listaProdutos.isEmpty()) {
            return null;
        }

        Produto produtoMaisCaro = listaProdutos.get(0);

        for (Produto produto : listaProdutos) {
            if (produto.getPreco() > produtoMaisCaro.getPreco()) {
                produtoMaisCaro = produto;
            }
        }

        return produtoMaisCaro;
    }
}
