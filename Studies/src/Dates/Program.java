package Dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDateTime r1 = LocalDateTime.ofInstant(d03,ZoneId.of("Portugal"));

//        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
//
//        System.out.println(d01.format(fmt1));
//        System.out.println(fmt2.format(d02));
//        System.out.println(fmt3.format(d03));

//        System.out.println(r1.getDayOfWeek());
//        System.out.println(r1.getDayOfMonth());
//        System.out.println(r1.getHour());
//        System.out.println(r1);


    }
}
