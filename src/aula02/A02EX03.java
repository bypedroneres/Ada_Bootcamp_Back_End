package aula02;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02EX03 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZoneId parisZone = ZoneId.of("Europe/Paris");
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        ZonedDateTime newYorkTime = zonedDateTime.withZoneSameInstant(newYorkZone);
        ZonedDateTime parisTime = zonedDateTime.withZoneSameInstant(parisZone);
        ZonedDateTime tokyoTime = zonedDateTime.withZoneSameInstant(tokyoZone);

        System.out.println("Hora em Nova York: " + newYorkTime);
        System.out.println("Hora em Paris: " + parisTime);
        System.out.println("Hora em Tóquio: " + tokyoTime);
    }
}
