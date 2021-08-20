package ru.devray.day9.funcinterf;

import java.util.function.*;

public class InterDemo {
    public static void main(String[] args) {

        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Hello");

        Supplier<Box> supplier = () -> new Box();
        supplier.get();

        Predicate<Box> predicate = (b) -> b != null;
        predicate.test(new Box());

        Function<Integer, String> function = (i) -> i + "" + i;
        function.apply(13);

        UnaryOperator<Integer> unaryOperator = i -> {return i++;};

    }
}
