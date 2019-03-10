package com.yang.learnjava8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class test3 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Month month = now.getMonth();
        System.out.println(month);
        int aaa = now.get(ChronoField.MONTH_OF_YEAR);

        DateTimeFormatter.ofPattern("YY-MM:dd");

        System.out.println(Instant.now());

    }
}
