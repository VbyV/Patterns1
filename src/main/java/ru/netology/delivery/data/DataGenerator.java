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
        // TODO: добавить логику для объявления переменной date и задания её значения, для генерации строки с датой
        // Вы можете использовать класс LocalDate и его методы для получения и форматирования даты
        return date;
    }

    public static String generateCity(String locale) {
        String city = faker.address().city();
        // TODO: добавить логику для объявления переменной city и задания её значения, генерацию можно выполнить
        // с помощью Faker, либо используя массив валидных городов и класс Random
        return city;
    }

    public static String generateName(String locale) {
        String name = faker.name().fullName();
        // TODO: добавить логику для объявления переменной name и задания её значения, для генерации можно
        // использовать Faker
        return name;
    }

    public static String generatePhone(String locale) {
        String phone = faker.phoneNumber().phoneNumber();
        // TODO: добавить логику для объявления переменной phone и задания её значения, для генерации можно
        // использовать Faker
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
            // TODO: добавить логику для создания пользователя user с использованием методов generateCity(locale),
            // generateName(locale), generatePhone(locale)

        }
        @Value
        public static class userInfo {
            String city;
            String name;
            String phone;
        }
    }

    }
