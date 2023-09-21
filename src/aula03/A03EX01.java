package aula03;

interface Operacao {
    Integer executar(Integer a, Integer b);
}

public class A03EX01 {
    public static void main(String[] args) {
        Integer numero01 = 2;
        Integer numero02 = 4;

        // Calculate sum
        Integer resultadoSoma = calcular(numero01, numero02);
        System.out.println(resultadoSoma);

        // Calculate subtraction
        Integer resultadoSubtracao = subtracao(numero01, numero02);
        System.out.println(resultadoSubtracao);

        // Create an instance of Operacao for sum
        Operacao operacaoSomar = new Operacao() {
            @Override
            public Integer executar(Integer a, Integer b) {
                return a + b;
            }
        };

        // Calculate with custom operation
        Integer resultadoOperacao = calcular(numero01, numero02, operacaoSomar);
        System.out.println(resultadoOperacao);
    }

    private static Integer subtracao(Integer numero01, Integer numero02) {
        return numero01 - numero02;
    }

    private static Integer calcular(Integer numero01, Integer numero02) {
        return numero01 + numero02;
    }

    private static Integer calcular(Integer numero01, Integer numero02, Operacao operacao) {
        return operacao.executar(numero01, numero02);
    }
}
