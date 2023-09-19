package aula02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class A02EX01 {
    public static void main(String[] args) {
        List<String> datasStrings = new ArrayList<>();
        datasStrings.add("2023-08-10");
        datasStrings.add("2022-05-20");
        datasStrings.add("2021-11-30");

        List<LocalDate> datas = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (String dataString : datasStrings) {
            LocalDate data = LocalDate.parse(dataString, formatter);
            datas.add(data);
            System.out.println("Data convertida: " + data);
        }
    }
}
