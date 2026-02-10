package com.nathan;

public class DateFormatter {
    public static String formatDate(java.time.LocalDate date) {
        return date.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static String formatDateTime(java.time.LocalDateTime dateTime) {
        return dateTime.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static java.time.LocalDate parseDate(String dateString) {
        return java.time.LocalDate.parse(dateString, java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static java.time.LocalDateTime parseDateTime(String dateTimeString) {
        return java.time.LocalDateTime.parse(dateTimeString,
                java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
