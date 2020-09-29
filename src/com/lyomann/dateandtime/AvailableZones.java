package com.lyomann.dateandtime;

import java.time.LocalDate;
import java.time.ZoneId;

public class AvailableZones {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

    }
}
