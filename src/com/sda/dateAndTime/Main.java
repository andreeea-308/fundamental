package com.sda.dateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        //LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int sec = localTime.getSecond();
        int nano = localTime.getNano();

        System.out.println(hour +"-"+minute+"-"+sec+"-"+nano);

        LocalTime localTime1 = LocalTime.of(10, 36, 39);
        localTime1 = localTime1.plusHours(1);
        System.out.println(localTime1);

        String timeFormater = localTime1.format(DateTimeFormatter.ofPattern("hh:m:s"));
        // H(0-23), h(1-12) , a (AM/PM), m, s, n
        System.out.println(timeFormater);

        //LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); //yyyy-MM-dd

        localDate = localDate.plusMonths(1);

        int an = localDate.getYear();
        int luna = localDate.getMonthValue();
        int zi = localDate.getDayOfMonth();
        int ziAn = localDate.getDayOfYear();

        System.out.println(zi+"/"+luna+"/"+an+" ->ziua din an"+ziAn);

        LocalDate revelion2024 = LocalDate.parse("2024-01-01");
        System.out.println(revelion2024);

        String dateFormatted = localDate.format(DateTimeFormatter.ofPattern("DD w dd/MM/yy"));
        //yy, yyyy, M, MM, dd, DD(zi din an), w(saptamana din an)
        System.out.println(dateFormatted);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 =LocalDateTime.of(2024, 01, 01, 00, 00, 00);
        boolean isBefore = localDateTime1.isBefore(localDateTime);
        System.out.println(isBefore);

        String dateTimeFormatter = localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println(dateTimeFormatter);

        //Instant
        Instant instant = Instant.now();
        System.out.println(instant);

        long secu = instant.getEpochSecond();
        int nanos = instant.getNano();
        System.out.println(sec+":"+nano);

        //Duration - intre 2 momente in timp
        LocalTime startCurs = LocalTime.of(9, 5, 40);
        LocalTime finalCurs = LocalTime.of(14, 1, 10);
        Duration durataCurs = Duration.between(startCurs, finalCurs);
        System.out.println("Durata cursului este: " + durataCurs);

        //Period - intre 2 date calendaristice
        LocalDate startDate = LocalDate.of(2023, 11, 18);
        LocalDate endDate = LocalDate.of(2024, 8, 12);
        Period period = Period.between(startDate, endDate);
        System.out.println("Perioada cursului: " + period);




    }
}
