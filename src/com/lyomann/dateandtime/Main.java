package com.lyomann.dateandtime;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        LocalDateTime nowLDT = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();
        System.out.println(now);
        System.out.println(nowLDT);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(instant);

    }
}
