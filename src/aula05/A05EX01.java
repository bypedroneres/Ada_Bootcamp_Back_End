package aula05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private String nome;
    private String categoria;

    public Produto(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }
}

public class A05EX01 {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Notebook", "Eletrônicos"),
                new Produto("Camisa", "Vestuário"),
                new Produto("Smartphone", "Eletrônicos"),
                new Produto("Tênis", "Calçados")
        );
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a categoria desejada: ");
        String categoriaDesejada = scanner.nextLine();
    
        List<Produto> produtosFiltrados = filtrarPorCategoria(produtos, categoriaDesejada);
    
        System.out.println("Produtos da categoria '" + categoriaDesejada + "':");
        for (Produto produto : produtosFiltrados) {
            System.out.println(produto.getNome());
        }
        
        scanner.close(); // Close the scanner to release resources
    }

    public static List<Produto> filtrarPorCategoria(List<Produto> listaProdutos, String categoriaDesejada) {
        List<Produto> produtosFiltrados = new ArrayList<>();

        for (Produto produto : listaProdutos) {
            if (produto.getCategoria().equals(categoriaDesejada)) {
                produtosFiltrados.add(produto);
            }
        }

        return produtosFiltrados;
    }
}
