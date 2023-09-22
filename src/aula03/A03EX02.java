package aula03;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

public class A03EX02 {
    public static void main(String[] args) {
        List<Produto> carrinhoDeCompras = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Digite o nome do produto (ou 'fim' para encerrar): ");
                String nomeProduto = scanner.nextLine();

                if (nomeProduto.equalsIgnoreCase("fim")) {
                    break;
                }

                System.out.print("Digite o preço do produto: ");
                double precoProduto;
                
                // Check if the next token is a double
                if (scanner.hasNextDouble()) {
                    precoProduto = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                } else {
                    System.out.println("Entrada inválida. Insira um valor numérico.");
                    scanner.nextLine(); // Consume the invalid input
                    continue; // Skip the current iteration and try again
                }

                Produto produto = new Produto(nomeProduto, precoProduto);
                carrinhoDeCompras.add(produto);
            }
        }

        // Lambda to calculate the total price of the shopping cart
        Function<List<Produto>, Double> calcularPrecoTotal = (produtos) -> {
            double precoTotal = 0.0;
            for (Produto produto : produtos) {
                precoTotal += produto.getPreco();
            }

            return precoTotal;
        };

        double precoTotal = calcularPrecoTotal.apply(carrinhoDeCompras);
        System.out.println("Preço total do carrinho de compras: R$" + precoTotal);
    }
}
