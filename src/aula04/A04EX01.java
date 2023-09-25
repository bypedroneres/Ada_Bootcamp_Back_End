package aula04;

import java.util.*;

public class A04EX01 {
    public static void main(String[] args) {
        // lista de números para multiplicar por 2
        List<Integer> lista = List.of(2, 3, 4, 5, 6);

        for (Integer i : lista) {
            System.out.println(i * 2);
        }
    }
}
