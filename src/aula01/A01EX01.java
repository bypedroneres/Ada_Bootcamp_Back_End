
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class A01EX01 {
    public LocalDate evento1() {
        return LocalDate.of(2000, 11, 1);
    }

    public LocalTime evento2() {
        return LocalTime.of(05, 0);
    }

    public LocalDateTime evento3() {
        return LocalDateTime.of(2021, 01, 24, 12, 00);
    }

    public static void main(String[] args) {
        A01EX01 eventos = new A01EX01();
        
        LocalDate dataEvento1 = eventos.evento1();
        System.out.println("Dia em que eu nasci: " + dataEvento1);

        LocalTime horarioEvento2 = eventos.evento2();
        System.out.println("Horas que eu acordo: " + horarioEvento2);

        LocalDateTime dataHoraEvento3 = eventos.evento3();
        System.out.println("Meu primeiro mochilão: " + dataHoraEvento3);
    }
}
