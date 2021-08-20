package ru.devray.day9.classtasks.librarytask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task92 {
    //Задание 9.2. Симулятор библиотекаря
    //
    //Создать класс, описывающий книгу - название, автор, год публикации, ISBN. Создать список книг (минимум 7),
    // выбрать те, где название начинается на А, вывести промежуточный результат (т.е. все книги, подходящие под критерий),
    // из этого подмножества выбрать те, которые были изданы до 1980 года,
    // так же вывести на экран с префиксом "Классическая литература ".
    //Написать решение в функциональном стиле (стримы, лямбды, ...)
    public static void main(String[] args) {


        List<Book> books = new ArrayList<>();
        books.add(new Book("Основание", "Азимов Айзек", 1954, "22094-343-461-0000"));
        books.add(new Book("Я, робот", "Азимов Айзек", 1903, "22094-343-461-0290"));
        books.add(new Book("Атлант расправил плечи", "Ренд Айн", 1918, "1009-45534-941-0000"));
        books.add(new Book("Книжный вор", "Зузак Маркус", 1989, "22323-461-007700"));
        books.add(new Book("Руслан и Людмила", "Пушкин Александр", 1998, "2205643-461-0000"));
        books.add(new Book("АВойна и мир", "Айзек Азимов", 1923, "22094-349990070"));
        books.add(new Book("Анна Каренина", "Айзек Азимов", 1809, "2209-461-00004343"));

        books.stream()
                .filter(new Predicate<Book>() {
                    @Override
                    public boolean test(Book s) {
                        return s.bookName.toUpperCase().startsWith("А");
                    }
                })
                .peek(System.out::println)
                .filter(d -> d.yearOfPublish < 1980)
                .forEach(s -> System.out.println("Классическая литература:" + s.bookName));

    }
}
