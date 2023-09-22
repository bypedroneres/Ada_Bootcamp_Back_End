package aula03;

import java.util.Scanner;
import java.util.function.BiFunction;

public class A03EX03 {
    public int executar(int a, int b, BiFunction<Integer, Integer, Integer> operacao) {
        return operacao.apply(a, b);
    }

    public static void main(String[] args) {
        A03EX03 calculadora = new A03EX03();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Soma
        int resultadoSoma = calculadora.executar(num1, num2, (a, b) -> a + b);
        System.out.println("Soma: " + resultadoSoma);

        // Subtração
        int resultadoSubtracao = calculadora.executar(num1, num2, (a, b) -> a - b);
        System.out.println("Subtração: " + resultadoSubtracao);

        // Multiplicação
        int resultadoMultiplicacao = calculadora.executar(num1, num2, (a, b) -> a * b);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        // Divisão
        int resultadoDivisao = calculadora.executar(num1, num2, (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                throw new IllegalArgumentException("Não é possível dividir por zero.");
            }
        });
        System.out.println("Divisão: " + resultadoDivisao);
    }
}