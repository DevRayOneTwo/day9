package ru.devray.day9.classtasks;

import java.util.Arrays;

public class Task91 {
    //Задание 9.1. Генератор человеков
    //
    //Дан строковый массив имен. Для каждого имени вывести в консоль имя + случайно сгенерированный возраст.
    //Написать решение в функциональном стиле (стримы, лямбды, ...)
    public static void main(String[] args) {
        String[] names = {"Gregory", "Alex", "Dmitry", "Pavel", "Susan", "Daniel"};
        Arrays.stream(names).forEach(s -> System.out.println(s + " " + (int) (Math.random() * 100)));
    }




}
