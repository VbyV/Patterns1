package ru.netology.delivery.data;

import com.github.javafaker.Faker;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {
    }

    private static Faker faker = new Faker(new Locale("ru"));

    public static String generateDate(int days) {
        String date = LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        return date;
    }

    public static String generateCity(String locale) {
        String city = faker.address().city();

        return city;
    }

    public static String generateName(String locale) {
        String name = faker.name().fullName();

        return name;
    }

    public static String generatePhone(String locale) {
        String phone = faker.phoneNumber().phoneNumber();

        return phone;
    }
    public static class Registration {
        private Registration() {
        }

        public static userInfo generateUser(String locale) {
            return new userInfo(
            generateCity("ru"),
            generateName("ru"),
            generatePhone("ru")
            );

        }
        @Value
        public static class userInfo {
            String city;
            String name;
            String phone;
        }
    }

    }
