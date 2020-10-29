package com.company.dates;

import com.sun.security.jgss.GSSUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDemo {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // 1 01
        System.out.println(now);
        System.out.println(now.plusWeeks(36).format(dtf));

        Period p = Period.ofYears(4);
        LocalDate result = now.minus(p);
        System.out.println(result.getDayOfWeek());


        LocalTime currentTime = LocalTime.now();
        LocalTime curr = LocalTime.parse("21:21:35.76859");
        LocalTime.of(20,20,20, 566);

        LocalTime localTime = currentTime.plus(313, ChronoUnit.MINUTES);

        LocalTime noon = LocalTime.NOON;
        boolean after = currentTime.isAfter(noon);
//        System.out.println(currentTime);

        LocalDateTime dt = LocalDateTime.now();
//        LocalDateTime dt2 = Loca
    }
}
